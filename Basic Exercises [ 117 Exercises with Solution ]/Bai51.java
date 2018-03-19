import java.util.*;
public class Bai51 {

 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap mot so (Kieu chuoi): ");
        String str1 = in.nextLine();
		int result = Integer.parseInt(str1);
        System.out.printf("Gia tri so nguyen la: %d",result);
		System.out.printf("\n");
    }
}