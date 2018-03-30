import java.util.*; 
import java.io.*; 
 public class bai32 {
 public static void main(String[] args)
 {
    int[] mang_so = {77, 77, 65, 65, 65, 77};
	System.out.println("Mang dau tien: "+Arrays.toString( mang_so)); 
	int num1 = 77;
    int num2 = 65;
	
	System.out.println("Ket qua: "+result( mang_so, num1, num2));
    }	
  
  public static boolean result(int[]  mang_so, int num1, int num2) {
    for (int number :  mang_so) {
      boolean r = number != num1 && number != num2;
      if (r) {
        return false;
        }
     }
        return true;
   }
}
