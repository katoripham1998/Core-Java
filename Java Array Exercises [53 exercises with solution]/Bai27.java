import java.util.Arrays; 
 public class bai27 {
 public static void main(String[] args)
 {
    int[] mang_so = {5, 7, 2, 4, 9};
	System.out.println("Mang dau tien: "+Arrays.toString(mang_so)); 
	int ctr = 0;
	for(int i = 0; i < mang_so.length; i++)
	{
		if(mang_so[i] % 2 == 0)
			ctr++;
	}
	System.out.println("So luong cac so chan : "+ctr);
	System.out.println("So luong cac so le  : "+(mang_so.length-ctr));
 }
}
