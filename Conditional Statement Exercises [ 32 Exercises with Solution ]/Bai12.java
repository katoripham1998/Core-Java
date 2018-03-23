import java.util.Scanner;
public class Bai12 {

    
  public static void main(String[] args)

{       
    int s=0;
	  double avg;
	  Scanner in = new Scanner(System.in);
    System.out.println("Nhap so thu nhat x1= ");  
		   int  x1 = in.nextInt();
		System.out.println("Nhap so thu hai x2= ");  
		    int x2 = in.nextInt();
		System.out.println("Nhap so thu ba x3= ");  
		    int x3 = in.nextInt();
		System.out.println("Nhap so thu tu x4= ");  
		    int x4 = in.nextInt();
		System.out.println("Nhap so thu nam x5= ");  
		    int x5 = in.nextInt();
  s=x1+x2+x3+x4+x5;
	avg=s/5;
	System.out.println("Tong cua 5 so la : " +s+"\nTrung binh cong la : " +avg);
 
}
}