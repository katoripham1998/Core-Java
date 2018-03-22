import java.util.Scanner;
public class Bai9 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so thu nhat: ");
        int a = in.nextInt();
        System.out.print("Nhap so thu hai: ");
        int b = in.nextInt();

        System.out.printf("Tong hai so la: %d%n", a+b);
        System.out.printf("Hieu hai so la: %d%n", a-b);
        System.out.printf("Tich cua hai so la: %d%n", a*b);
        System.out.printf("Trung binh cong hai so la: %.2f%n", (double) (a+b) / 2);
        System.out.printf("Khoang cach giua hai so la: %d%n", Math.abs(a-b));
        System.out.printf("So long nhat: %d%n", Math.max(a,b));
        System.out.printf("So nho nhat: %d%n", Math.min(a,b));
    }
}