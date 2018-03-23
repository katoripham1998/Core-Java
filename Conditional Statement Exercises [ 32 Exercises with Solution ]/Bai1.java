import java.util.Scanner;
public class Bai1 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        int input = in.nextInt();

        if (input > 0)
        {
            System.out.println("So da nhap la so duong");
        }
        else if (input < 0)
        {
            System.out.println("So da nhap la so am");
        }
        else
        {
            System.out.println("So da nhap la 0");
        }
    }
}