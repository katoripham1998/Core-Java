package baimang31;

import java.util.Scanner;

public class Bai18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap chuoi ky tu ");
		Scanner key= new Scanner(System.in);
		String s= key.nextLine();
		int kq= s.hashCode();
		System.out.println("Hash code cua "+s+" la: "+kq);
	}

}
