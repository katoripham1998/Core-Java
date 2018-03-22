package btap;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double in,m;
		System.out.print("Nhap gia tri cua inch ");
		Scanner key= new Scanner(System.in);
		in= key.nextDouble();
		m=in*0.0254;
		System.out.print("Gia tri meter tuong ung la "+ m);
	}

}
