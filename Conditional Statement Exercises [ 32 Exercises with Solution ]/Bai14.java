import java.util.Scanner;
public class Bai14 {

   public static void main(String[] args)

{
   int i,n;

   System.out.print("Nhap so n= ");

    Scanner in = new Scanner(System.in);
		    n = in.nextInt();

   System.out.println ("\n");
   for(i=0;i<=n;i++)
  
     System.out.println(n+" X "+i+" = " +n*i);
}
}