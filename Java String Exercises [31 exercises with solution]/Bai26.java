package baimang31;

import java.util.Scanner;

public class Bai26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap chuoi ky tu ");
		Scanner key= new Scanner(System.in);
		String s1= key.nextLine();
		System.out.println("Nhap chuoi ky tu ");
		String s2= key.nextLine();
		boolean kq= s1.startsWith(s2);
		System.out.println("Chuoi "+s1+" co bat dau voi " +s2+ " :" +kq);
	}

}
