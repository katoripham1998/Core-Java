import java.util.Scanner;
public class Bai30 {

  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int x = in.nextInt();
        System.out.print("Nhap so thu hai: ");
        int y = in.nextInt();
        System.out.print("Nhap so thu ba: ");
        int z = in.nextInt();

        if (x == y && x == z)
        {
            System.out.println("Ba so deu bang nhau");
        }
        else if ((x == y) || (x == z) || (z == y))
        {
            System.out.println("Ca hai deu khong bang hoac khac nhau");
        }
        else
        {
            System.out.println("Ca ba so deu khac nhau");
        }
    }
}
