package btap;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Nhap khoang thoi gian cho GMT: ");
        long timeZoneChange = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Thoi diem hien tai la " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}

}
