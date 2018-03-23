import java.util.Scanner;
public class Bai8 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Nhap mot ky tu Alphabet: ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean nguyenam = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Loi. Khong ohai mot ky tu");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Loi.Khong phai la mot ky tu. Nhap vao mot ky tu viet hoa hoac viet thuong");
        }
        else if (nguyenam)
        {
            System.out.println("ky tu nhap vao la nguyen am");
        }
        else
        {
            System.out.println("Ky tu nhap vao la phu am");
        }
    }
}