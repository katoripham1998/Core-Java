import java.util.Scanner;
public class Bai27 {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        int n = in.nextInt();

        if (n > 0)
        {
            System.out.println("So da nhap la so duong");
        }
        else if (n < 0)
        {
            System.out.println("So da nhap la so am");
        }
        else
        {
            System.out.println("So da nhap la 0");
        }
    }
}