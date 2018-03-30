import java.util.Arrays;
 
public class bai50
{
     static int[] sapxep(int[] new_arra, int n)
    {
        int temp[] = new int[n];
     
         int small_num = 0, large_num = n-1;
         boolean flag = true;
     
        for (int i=0; i < n; i++)
        {
            if (flag)
                temp[i] = new_arra[large_num--];
            else
                temp[i] = new_arra[small_num++];
     
            flag = !flag;
        }
     
        return temp;
    }
 
    public static void main(String[] args) 
    {
        int nums[] = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int result[];
         
        System.out.println("mang ban dau ");
        System.out.println(Arrays.toString(nums));
         
        result = sapxep(nums,nums.length);
         
        System.out.println("mang moi ");
        System.out.println(Arrays.toString(result));
     
    }
}
