package baimang31;

import java.util.Scanner;

public class Bai24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap chuoi ky tu ");
		Scanner key= new Scanner(System.in);
		String s= key.nextLine();
		String kq= s.replace('d', 'f');
		System.out.println("Chuoi sau khi thay the: "+kq);
	}

}
