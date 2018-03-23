import java.util.Scanner;
public class Bai15 {

   public static void main(String[] args)

{
   int i,n,sum=0;

   System.out.print("Nhap n= ");
   Scanner in = new Scanner(System.in);
		    n = in.nextInt();
  System.out.println (n+" so tu nhien le dau tien la");
   for(i=1;i<=n;i++)

   {
     System.out.println (2*i-1);
     sum=sum + (2*i-1);
   }
   System.out.println ("Tong " +n+ " so le dau tien la " +sum);

}
}