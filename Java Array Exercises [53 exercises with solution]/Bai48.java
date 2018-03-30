import java.util.Arrays;

public class bai48 {

    public static void main(String[] args) {
        int[] nums = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
		System.out.println("mang ban dau: "+Arrays.toString(nums)); 
        sort_nums(nums);
        System.out.println("mang moi: "+Arrays.toString(nums)); 
    }
    public static void sort_nums(int[] nums){
        int duong = 0;
        int am = 0;
        int i,j;
        int max = Integer.MIN_VALUE;
        for(i=0; i<nums.length; i++){
            if(nums[i]<0) am++;
            else duong++;
            if(nums[i]>max) max = nums[i];
        }
        max++;
        if(am==0 || duong == 0) return;
        i=0;
        j=1;
        while(true){
            while(i<=am && nums[i]<0) i++;
            while(j<nums.length && nums[j]>=0) j++;
            if(i>am || j>=nums.length) break;
            nums[i]+= max*(i+1);
            swap_nums(nums,i,j);
        }

        i = nums.length-1;
        while(i>=am){
            int div = nums[i]/max;
            if(div == 0) i--;
            else{
                nums[i]%=max;
                swap_nums(nums,i,am+div-2); 
            }
        }

    }
    private static void swap_nums(int[] nums, int i , int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
