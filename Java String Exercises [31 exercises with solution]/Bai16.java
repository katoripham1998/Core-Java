package baimang31;

public class Bai16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "This is a sample String.";

	        byte[] byte_arr = str.getBytes();

	        String new_str = new String(byte_arr);

	        System.out.println("\nMang moi la:  " + new_str + "\n");
	}

}
