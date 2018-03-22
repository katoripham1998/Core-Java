package btap;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap so phut ");
		Scanner key= new Scanner(System.in);
		int minutes=key.nextInt();
		int n=365*24*60;
		int nam=minutes/n;
		int ngay=(minutes%n)/(24*60);
		System.out.println(minutes+" phut ="+nam+" nam "+ngay+" ngay");
	}

}
