package btstring31;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap mot chuoi ky tu ");
		Scanner key= new Scanner(System.in);
		String s= key.nextLine();
		System.out.println("Codepoint Count = "+ s.codePointCount(0, s.length()));
	}

}
