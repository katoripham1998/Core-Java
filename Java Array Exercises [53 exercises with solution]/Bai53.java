import java.io.*;
import java.util.Arrays;
class bai53 
{
   public static void main (String[] args)
    {
        int so[] = {45, 20, 100, 23, -5, 2, -6};
		int ketqua[];
		System.out.println("mang ban dau ");
        System.out.println(Arrays.toString(so));

        so = sogannhat(so);
        System.out.println("mang sau khi thay the:");
        System.out.println(Arrays.toString(ketqua));
    }
 
    static int [] sogannhat(int arr_so[])
    {
        int size = arr_nums.length;
        int max_from_right_num =  arr_so[size-1];
        arr_nums[size-1] = -1;
 
        for (int i = size-2; i >= 0; i--)
        {
            int temp = arr_so[i];
            arr_so[i] = max_from_right_num;
            if(max_from_right_num < temp)
            max_from_right_num = temp;
        }
		return arr_so;
    } 
}
