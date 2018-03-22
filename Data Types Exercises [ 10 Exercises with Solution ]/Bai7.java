import java.util.Scanner;
public class Bai7 {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

		float tggiay;
		float mps,kph, mph;

		System.out.print("Nhap khoang cach theo met: ");
		float kc = scanner.nextFloat();

		System.out.print("Nhap gio: ");
		float gio = scanner.nextFloat();

		System.out.print("Nhap phut: ");
		float phut = scanner.nextFloat();

		System.out.print("Nhap giay: ");
		float giay = scanner.nextFloat();

		tggiay = (gio*3600) + (phut*60) + giay;
		mps = kc/tggiay;
		kph = ( kc/1000.0f ) / ( tggiay/3600.0f );
		mph = kph / 1.609f;

		System.out.println("Toc do cua ban theo m/s la "+mps);
		System.out.println("Toc do cua ban theo km/h "+kph);
		System.out.println("Toc do cua ban theo miles/h la "+mph);
		

		scanner.close();
	}
}