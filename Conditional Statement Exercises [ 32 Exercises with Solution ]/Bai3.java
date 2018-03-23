import java.util.Scanner;
public class Bai3 {

    
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Nhap so thu nhat: ");
  int a = in.nextInt();
   
  System.out.print("Nhap so thu hai: ");
  int b = in.nextInt();
   
  System.out.print("Nhap so thu ba: ");
  int c = in.nextInt();
   
   
  if (a > b)
   if (a > c)
    System.out.println("So lon nhat la: " +a);
   
  if (b> a)
   if (b > c)
    System.out.println("So lon nhat lat: " + b);
   
  if (c > a)
   if (c > b)
    System.out.println("So lon nhat la: " + c);
 }
}