import java.util.Scanner;
public class Bai7 {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int songay = 0; 
        String tenthang = "Unknown";

        System.out.print("Nhap thang: ");
        int thang = input.nextInt();

        System.out.print("Nhap nam: ");
        int nam = input.nextInt();

        switch (thang) {
            case 1:
                tenthang = "thang mot";
                songay = 31;
                break;
            case 2:
                tenthang = "thang hai";
                if ((nam % 400 == 0) || ((nam % 4 == 0) && (nam % 100 != 0))) {
                   songay = 29;
                } else {
                    songay = 28;
                }
                break;
            case 3:
                tenthang = "thang ba";
                songay = 31;
                break;
            case 4:
                tenthang = "thang tu";
                songay = 30;
                break;
            case 5:
                tenthang = "thang nam";
                songay = 31;
                break;
            case 6:
                tenthang = "thang sau";
                songay = 30;
                break;
            case 7:
                tenthang = "thang bay";
                songay = 31;
                break;
            case 8:
                tenthang = "thang tam";
                songay = 31;
                break;
            case 9:
                tenthang = "thang chin";
                songay = 30;
                break;
            case 10:
                tenthang = "thang muoi";
                songay = 31;
                break;
            case 11:
                tenthang = "thang muoi mot";
                songay = 30;
                break;
            case 12:
                tenthang = "thang muoi hai";
                songay = 31;
        }
        System.out.print(tenthang + " " + nam + " co " + songay + " ngay\n");
    }
}