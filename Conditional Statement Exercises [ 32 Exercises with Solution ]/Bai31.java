import java.util.Scanner;
public class Bai31 {
   public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        double x = in.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double y = in.nextDouble();
       System.out.print("Nhap so thu ba: ");
        double z = in.nextDouble();
        if (x < y && y < z)
        {
            System.out.println("Tang dan");
        }
        else if (x > y && y > z)
        {
            System.out.println("Giam dan");
        }
        else
        {
            System.out.println("Khong tang khong giam");
        }
    }
}