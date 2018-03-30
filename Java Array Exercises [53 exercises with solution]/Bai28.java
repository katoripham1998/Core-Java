import java.util.Arrays; 
 public class bai28 {
 public static void main(String[] args)
 {
    int[] array_nums = {5, 7, 2, 4, 9};
	System.out.println("mang dau tien: "+Arrays.toString(array_nums)); 
	int max_val = array_nums[0];
	int min = array_nums[0];
	for(int i = 1; i < array_nums.length; i++)
	{
		if(array_nums[i] > max_val)
			max_val = array_nums[i];
		else if(array_nums[i] < min)
			min = array_nums[i];
	}
	System.out.println("Sự khác biệt giữa giá trị lớn nhất và nhỏ nhất của mảng nói trên: "+(max_val-min));	
 }
}
