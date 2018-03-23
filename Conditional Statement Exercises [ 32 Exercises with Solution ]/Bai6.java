import java.util.Scanner;
public class Bai6 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap x=");
        double x = in.nextDouble();
        System.out.print("Nhap y= ");
        double y = in.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("Hai so tren giong nhau den ba chu so thap phan");
        }
        else
        {
            System.out.println("Hai so tren khac nhau");
        }
    }
}
