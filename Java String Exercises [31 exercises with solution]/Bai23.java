package baimang31;

import java.util.Scanner;

public class Bai23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap chuoi ky tu thu nhat ");
		Scanner key= new Scanner(System.in);
		String s1= key.nextLine();
		System.out.println("Nhap chuoi ky tu thu hai ");
		String s2= key.nextLine();
		boolean kq= s1.regionMatches(4,s2 , 0, s2.length());
		System.out.println("Ket qua la: "+kq);
	}

}
