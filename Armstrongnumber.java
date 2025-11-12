import java.util.*;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = num;
		int count = 0;
		int res = 0;
		while (num != 0) {
			int dig = num % 10;
			count++;
			num = num / 10;
		}
		while (num1 != 0) {
			int dig = num1 % 10;
			res += Math.pow(dig, count);
			num1 = num1 / 10;
		}
		System.out.print(res);
	}

}
