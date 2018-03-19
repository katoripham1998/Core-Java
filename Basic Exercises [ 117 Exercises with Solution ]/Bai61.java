import java.util.*;
 public class Bai61 {
     public static void main(String[] args){	
     Scanner in = new Scanner(System.in);
     System.out.print("\nNhap mot tu: ");
	 String word = in.nextLine();
	 word = word.trim();
	 String result = ""; 
     char[] ch=word.toCharArray();  
	 for (int i = ch.length - 1; i >= 0; i--) {
			 result += ch[i];
		 }
	 System.out.println("Tu dao nguoc: "+result.trim()); 
	 }			
}