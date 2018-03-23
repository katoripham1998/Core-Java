import java.util.Scanner;
public class Bai5 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int ngay = in.nextInt();
        switch (ngay) {
            case 1:{System.out.println("Thu hai"); break;}
            case 2:{System.out.println("Thu ba"); break;}
            case 3:{System.out.println("Thu tu"); break;}
            case 4:{System.out.println("Thu nam"); break;}
            case 5:{System.out.println("Thu sau"); break;}
            case 6:{System.out.println("Thu bay"); break;}
            case 7:{System.out.println("Chu nhat"); break;}
            default:{System.out.println("Gia tri nhap khong hop le"); break;}
    }
  }
}