package btap;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c,f;
		System.out.print("Nhap nhiet do Fahrenheit ");
		Scanner key= new Scanner(System.in);
		f= key.nextDouble();
		c=(5*(f-32.0))/9.0;
		System.out.print("Nhiet do Cenxius tuong ung la "+ c);
	}

}
