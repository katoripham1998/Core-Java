import java.util.Scanner;
public class Bai17 {
 public static void main(String[] args)
 {
  long a, b;
  int i = 0, sd = 0;
  int[] sum = new int[20];
  Scanner in = new Scanner(System.in);

  System.out.print("Nhap so nhi phan dau tien: ");
  a = in.nextLong();
  System.out.print("Nhap so nhi phan thu hai: ");
  b = in.nextLong();

  while (a != 0 || b != 0) 
  {
   sum[i++] = (int)((a % 10 + b % 10 + sd) % 2);
   sd = (int)((a % 10 + b % 10 + sd) / 2);
   a = a / 10;
   b = b / 10;
  }
  if (sd != 0) {
   sum[i++] = sd;
  }
  --i;
  System.out.print("Tong cua hai so nhi phan: ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}
