import java.util.Scanner;
public class Bai13 {

   public static void main(String[] args)

{
    int i,n;

      System.out.print("Nhap n= ");
    Scanner in = new Scanner(System.in);
		    n = in.nextInt();

     for(i=1;i<=n;i++)
     {
     System.out.println("Lap phuong cua " +i+" la "+(i*i*i));     
    }
 }
}