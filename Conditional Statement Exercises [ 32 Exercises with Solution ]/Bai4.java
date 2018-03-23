import java.util.Scanner;
public class Bai4 {

    
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Nhap so nguyen m: ");
  int m = in.nextInt();
  if (m > 0)
    System.out.println("Gia tri cua n la 1");
  else {
    if(m<0) System.out.println("Gia tri cua n la-1");
    else System.out.println("Gia tri cua na la 0");
  }
 }
}