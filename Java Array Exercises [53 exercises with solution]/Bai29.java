import java.util.*; 
import java.io.*; 
 public class bai29 {
 public static void main(String[] args)
 {
    int[] array_nums = {5, 7, 2, 4, 9};
	System.out.println("mang dau tien: "+Arrays.toString(array_nums)); 
	int max = array_nums[0];
	int min = array_nums[0];
	float sum = array_nums[0];
	for(int i = 1; i < array_nums.length; i++)
	{
		sum  += array_nums[i];
		if(array_nums[i] > max)
			max = array_nums[i];
		else if(array_nums[i] < min)
			min = array_nums[i];
	}
	float x = ((sum-max-min) / (array_nums.length - 2));
	System.out.printf("Tính giá trị trung bình của mảng các số nguyên trừ các giá trị lớn nhất và nhỏ nhất: %.2f",x);
	System.out.print("\n");	
  }
}
