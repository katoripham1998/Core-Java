import java.util.Scanner;
public class Bai2 {

    
  public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

            System.out.print("Nhap a: ");
            double a = input.nextDouble();
            System.out.print("Nhap b: ");
            double b = input.nextDouble();
            System.out.print("Nhap c: ");
            double c = input.nextDouble();

            double D = b * b - 4.0 * a * c;

            if (D > 0.0) {
                double x1 = (-b + Math.pow(D, 0.5)) / (2.0 * a);
                double x2 = (-b - Math.pow(D, 0.5)) / (2.0 * a);
                System.out.println("Nghiem la " + x1 + " va " + x2);
            } else if (D == 0.0) {
                double x1 = -b / (2.0 * a);
                System.out.println("Nghiem la " + x1);
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }

    }
}