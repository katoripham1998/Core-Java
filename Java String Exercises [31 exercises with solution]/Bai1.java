package btstring31;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap mot chuoi ky tu: ");
		Scanner key= new Scanner(System.in);
		String s= key.nextLine();
		System.out.println("Nhap vi tri ky tu muon lay x= ");
		int x= key.nextInt();
		char kq=s.charAt(x);
		System.out.println("Ket qua la "+kq);
	}

}
