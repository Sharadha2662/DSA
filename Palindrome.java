import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		int rev = 0;
		
		while (num != 0) {
			int dig = num % 10;
			rev = (rev * 10) + dig;
			num = num / 10;
		}
		if (n == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}

}
