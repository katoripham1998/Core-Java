import java.util.*; 
import java.io.*; 
 public class Bai103 {
 public static void main(String[] args)
 {
	int[] array_so = {11, 10, 13, 10, 45, 20, 33, 53};
    int kq = 0; 
	System.out.println("Nhap mang: "+Arrays.toString(array_so)); 
	
	int l = array_so.length - 1;
	int[] new_array;
	while(array_so[l] != 10)
		l--;
	new_array = new int[array_so.length - 1 - l];
	for(int i = l + 1; i < array_so.length; i++)
		new_array[i - l - 1] = array_so[i];
	System.out.println("Mang moi: "+Arrays.toString(new_array)); 
  }
}