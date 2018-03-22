import java.util.Scanner;
public class Bai8 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nahp gia tri mot canh ");
        double a = in.nextDouble();

        System.out.printf("Hinh vuong: %6.2f\n", a*a);
        System.out.printf("Hinh lap phuong: %6.2f\n",a*a*a);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(a, 4));
    }
}