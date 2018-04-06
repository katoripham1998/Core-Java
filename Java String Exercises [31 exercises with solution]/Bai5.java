package btstring31;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap chuoi ky tu thu nhat ");
		Scanner key= new Scanner(System.in);
		String s1= key.nextLine();
		System.out.println("Nhap chuoi ky tu thu hai ");
		String s2= key.nextLine();
		int kq= s1.compareTo(s2);
		if (kq==0) System.out.println(s1+" bang "+s2);
		else {
			if(kq>0) System.out.println(s1+" lon hon "+s2 );
			else System.out.println(s1+" nho hon "+s2);
		}
	}

}
