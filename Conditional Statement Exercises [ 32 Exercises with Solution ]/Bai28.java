import java.util.Scanner;
public class Bai28 {

   public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap mot so: ");
        double n = in.nextDouble();

        if (n > 0)
        {
            if (n < 1)
            {
                System.out.println("Dương nhỏ");
            }
            else if (n > 1000000)
            {
                System.out.println("Dương lớn");
            }
            else
            {
                System.out.println("Dương");
            }
        }
        else if (n < 0)
        {
            if (Math.abs(n) < 1)
            {
                System.out.println("Âm nhỏ");
            }
            else if (Math.abs(n) > 1000000)
            {
                System.out.println("Âm lớn");
            }
            else
            {
                System.out.println("Âm");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}