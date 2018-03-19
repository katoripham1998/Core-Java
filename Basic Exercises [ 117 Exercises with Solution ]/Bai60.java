import java.util.*;
 public class Bai60 {
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in);
     System.out.print("Nhap mot cau bat ky: ");
	 String line = in.nextLine();
	 String[] words = line.split("[ ]+");
	 System.out.println("Từ áp chót: "+words[words.length - 2]);
	 }			
}