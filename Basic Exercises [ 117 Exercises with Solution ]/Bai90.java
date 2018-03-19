import java.lang.*;
 public class Bai90 {
 public static void main(String[] args)
 {
	  // gets the value of the specified environment variable "PATH"
      System.out.println("\nMoi truong bien cua PATH: ");
      System.out.println(System.getenv("PATH"));

      // gets the value of the specified environment variable "TEMP"
      System.out.println("\nMoi truong bien cua TEMP: ");
      System.out.println(System.getenv("TEMP"));

      // gets the value of the specified environment variable "USERNAME"
      System.out.println("\nMoi truong bien cua USERNAME: ");
      System.out.println(System.getenv("USERNAME"));
  }
}