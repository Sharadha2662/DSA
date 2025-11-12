import java.util.*;

public class SmallestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = n;
		
		int a = 10;
		while (num != 0) {
			int dig = num % 10;
			if (dig < a) {
				a = dig;
			}
				num = num / 10;
		}
		System.out.println(a);
	}

}
