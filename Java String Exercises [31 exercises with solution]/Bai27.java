package baimang31;

import java.util.Scanner;

public class Bai27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap chuoi ky tu ");
		Scanner key= new Scanner(System.in);
		String s= key.nextLine();
		System.out.println("Nhap vi tri bat dau ");
		int n1= key.nextInt();
		System.out.println("Nhap vi tri ket thuc ");
		int n2= key.nextInt();
		String kq= s.substring(n1, n2);
		System.out.println("Chuoi con la "+kq);
	}

}
