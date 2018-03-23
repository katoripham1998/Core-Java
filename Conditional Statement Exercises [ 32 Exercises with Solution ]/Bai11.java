import java.util.Scanner;
public class Bai11 {

    
  public static void main(String[] args)

{
   int i, n, sum=0;
   {
   Scanner in = new Scanner(System.in);  
        System.out.print("Nhap n= ");  
         n = in.nextInt();
}
  System.out.println(n+" so tu nhien dau tien la : ");
  
 for(i=1;i<=n;i++)
   {
     System.out.println(i);
     sum+=i;
   }
System.out.println("Tong cac so tu nhien den "+n+ " la : " +sum);

}
}