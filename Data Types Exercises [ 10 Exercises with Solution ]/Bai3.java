package btap;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Nhap mot so nguyen tu 0-1000");
		Scanner key= new Scanner(System.in);
		a=key.nextInt();
		int tram=a/100;
		int chuc=(a%100)/10;
		int dv=(a%100)%10;
		int tong=tram+chuc+dv;
		System.out.println("Tong cac chu so cua "+a+" la "+tong);
	}

}
