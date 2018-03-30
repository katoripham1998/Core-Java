public class bai33 {    
   public static void main(String[] args) {
        int nums[] = {20, 20, 30, 40, 50, 50, 50};  
		System.out.println("mang dau tin: "+nums.length);
		System.out.print("cac phan tu cua mang: ");
       for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
		System.out.println("\nPhan tu moi cua mang: "+array_sort(nums));
			
    }
    
    public static int array_sort(int[] nums) {
         int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index-1])
                nums[index++] = nums[i];
        }
	  return index;
    }
}
