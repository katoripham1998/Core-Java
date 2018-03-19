import java.util.Scanner;
public class Bai33 { 
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so n: ");
        long n = input.nextLong();
        System.out.println("Tong cua cac chu so la: " + sumDigits(n));

    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}