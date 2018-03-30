import java.util.*; 
import java.io.*; 
 public class bai30 {
 public static void main(String[] args)
 {
    int[] array_nums = {50, 77, 12, 54, -11};
	System.out.println("mang dau tien: "+Arrays.toString(array_nums)); 
	System.out.println("ket qua: "+test(array_nums));
    }	
    public static boolean test(int[] numbers) {
    for (int number : numbers) {
      if (number == 0 || number == -1) {
        return false;
      }
    }
    return true;
  }  
}
