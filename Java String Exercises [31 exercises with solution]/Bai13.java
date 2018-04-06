package baimang31;

import java.util.Scanner;

public class Bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap chuoi ky tu thu nhat ");
		Scanner key= new Scanner(System.in);
		String s1= key.nextLine();
		System.out.println("Nhap chuoi ky tu thu hai ");
		String s2= key.nextLine();
		System.out.println("Nhap chuoi ky tu thu ba ");
		String s3= key.nextLine();
		boolean kq1= s1.equals(s2);
		boolean kq2= s1.equals(s3);
		boolean kq3= s2.equals(s3);
		System.out.println("Chuoi "+s1+" co bang chuoi "+s2+" :"+kq1);
		System.out.println("Chuoi "+s1+" co bang chuoi "+s3+" :"+kq2);
		System.out.println("Chuoi "+s2+" co bang chuoi "+s3+" :"+kq3);
	}

}
