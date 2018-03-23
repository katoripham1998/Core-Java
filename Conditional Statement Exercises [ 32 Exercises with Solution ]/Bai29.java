import java.util.Scanner;
public class Bai29 {

   public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen nho hon 10 ty: ");

        if (in.hasNextLong())
        {

            long n = in.nextLong();

            if (n < 0)
            {
                n *= -1;
            }
            if (n >= 10000000000L)
            {
                System.out.println("So vua nhap lon hon hoac bang 10,000,000,000!");
            }
            else
            {
                int t = 1;
                if (n >= 10 && n < 100)
                {
                    t = 2;
                }
                else if (n >= 100 && n < 1000)
                {
                    t = 3;
                }
                else if (n >= 1000 && n < 10000)
                {
                    t = 4;
                }
                else if (n >= 10000 && n < 100000)
                {
                    t = 5;
                }
                else if (n >= 100000 && n < 1000000)
                {
                    t = 6;
                }
                else if (n >= 1000000 && n < 10000000)
                {
                    t = 7;
                }
                else if (n >= 10000000 && n < 100000000)
                {
                    t = 8;
                }
                else if (n >= 100000000 && n < 1000000000)
                {
                    t = 9;
                }
                else if (n >= 1000000000 && n < 10000000000L)
                {
                    t = 10;
                }
                System.out.println("So chu so la: " + t);
            }
        }
        else
        {
            System.out.println("So da nhap khong phai so nguyen ");
        }
    }
}