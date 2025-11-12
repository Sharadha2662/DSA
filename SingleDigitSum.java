import java.util.*;

public class SingleDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;	
		while(num >= 10) {
			int sum = 0;
		while(num != 0) {
			int dig = num % 10;
			sum += dig;
			num = num / 10;
		}
		num = sum;
		}
		System.out.print(num);
	}

}
