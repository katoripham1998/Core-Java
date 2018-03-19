import java.util.*; 
import java.io.*; 
 public class Bai101 {
 public static void main(String[] args)
 {
	int[] array_so = {10, 11, 10, 30, 45, 20, 33, 53};
    int kq = 0; 
	System.out.println("Nhap mang: "+Arrays.toString(array_so)); 
    
	int n1 = 0;
    int n2 = 0;
      
    for(int i = 0; i < array_so.length; i++) {
        if(array_so[i] == 10)
            n1++;
                        
        if(array_so[i] == 20)
            n2++;
    }                                      
    System.out.printf(String.valueOf(n1 > n2));
	System.out.printf("\n");
  }
}