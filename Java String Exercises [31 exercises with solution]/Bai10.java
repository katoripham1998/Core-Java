package btstring31;

import java.util.Scanner;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap chuoi ky tu thu nhat ");
		Scanner key= new Scanner(System.in);
		String s1= key.nextLine();
		System.out.println("Nhap chuoi ky tu thu hai ");
		String s2= key.nextLine();
		boolean kq= s1.contentEquals(s2);
		System.out.println("Chuoi "+s1+ " co bang chuoi "+s2+" khong :"+kq);
	}

}
