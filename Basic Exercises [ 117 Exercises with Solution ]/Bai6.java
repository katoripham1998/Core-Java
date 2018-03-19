import java.util.Scanner;
 
public class Bai6 {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Nhap a= ");
  int a = in.nextInt();
   
  System.out.print("Nhap b= ");
  int b = in.nextInt();
   
 
  System.out.println(a + " + " + b + " = " + 
  (a + b));
   
  System.out.println(a + " - " + b + " = " + 
  (a - b));
   
  System.out.println(a + " x " + b + " = " + 
  (a * b));
   
  System.out.println(a + " / " + b + " = " + 
  (a / b));
 
  System.out.println(a + " mod " + b + " = " + 
  (a % b));
 }
 
}