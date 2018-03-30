import java.util.*; 
import java.io.*; 
 public class bai31 {
 public static void main(String[] args)
 {
    int[] array_nums = {10, 77, 10, 54, -11, 10};
	System.out.println("Mang dau tien: "+Arrays.toString(array_nums)); 
	int search_num = 10;
    int fixed_sum = 30;
	
	System.out.println("Ket qua: "+result(array_nums, search_num, fixed_sum));
    }	
  
  public static boolean result(int[] numbers, int search_num, int fixed_sum) {
   int temp_sum = 0;
   for (int number : numbers) {
      if (number == search_num) {
        temp_sum += search_num;
      }

      if (temp_sum > fixed_sum) {
        break;
      }
    }
    return temp_sum == fixed_sum;
  }  
}
