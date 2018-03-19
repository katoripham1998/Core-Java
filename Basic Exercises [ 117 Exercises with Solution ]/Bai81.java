import java.util.Arrays; 
 public class Bai81 {
 public static void main(String[] args)
 {
    int[] array_nums = {20, 30, 40};
	System.out.println("Mang: "+Arrays.toString(array_nums)); 
	int x = array_nums[0];
	array_nums[0] = array_nums[array_nums.length-1];
	array_nums[array_nums.length-1] = x;
	System.out.println("Mang moi sau khi doi cho dau va cuoi: "+Arrays.toString(array_nums));  
 }
}