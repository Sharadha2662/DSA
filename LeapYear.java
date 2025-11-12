import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0  ||year% 400 == 0) {
			System.out.print("Leap year");
		} else {
			System.out.print("Not a leap year");
		}
	}

}
