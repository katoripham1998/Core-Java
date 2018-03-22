import java.util.Scanner;
public class Bai6 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Nhap can nang theo pounds ");
        double cannang = input.nextDouble();

        System.out.print("Nhap chieu cao theo inches: ");
        double chieucao = input.nextDouble();

        double BMI = can nang * 0.45359237 / (chieucao * 0.0254 * chieucao * 0.0254);
        System.out.print("Chi so BMI cua co the la " + BMI+"\n");
    }
}