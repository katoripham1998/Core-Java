import java.util.Scanner;
public class Bai18 {
 public static void main(String[] args)
 {
  long a, b, multiply = 0;
  int digit, factor = 1;
  Scanner in = new Scanner(System.in);
  System.out.print("Nhap so nhi phan thu nhat: ");
  a = in.nextLong();
  System.out.print("Nhap so nhi phan thu hai: ");
  b = in.nextLong();
  while (b != 0)
  {
   digit = (int)(b % 10);
   if (digit == 1) 
   {
    a = a * factor;
    multiply = binaryproduct((int) a, (int) multiply);
   } 
   else
   {
   a = a * factor;
   }
   b = b / 10;
   factor = 10;
  }
  System.out.print("Tich hai so nhi phan la: " + multiply+"\n");
 }
 static int binaryproduct(int binary1, int binary2) 
 {
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  int binary_prod_result = 0;

  while (binary1 != 0 || binary2 != 0) 
  {
   sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
   remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0)
  {
   sum[i++] = remainder;
  }
  --i;
  while (i >= 0) 
  {
   binary_prod_result = binary_prod_result * 10 + sum[i--];
  }
  return binary_prod_result;
 }
 }