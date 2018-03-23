import java.util.Scanner;
public class Bai32 {

public static void main(String[] args) { 
 Scanner input = new Scanner(System.in); 
 System.out.print("Nhap so thu nhat: "); 
 double num1 = input.nextDouble(); 
 System.out.print("Nhap so thu hai: "); 
 double num2 = input.nextDouble(); 
 input.close(); 
  
 if (Math.abs(num1 - num2) <= 0.01) { 
     System.out.println("Nhung so tren giong nhau."); 
 } 
 else { 
     System.out.println("Nhung so tren khac nhau."); 
 } 
    } 
}