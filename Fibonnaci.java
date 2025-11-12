import java.util.*;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		System.out.println(fib1);
		System.out.println(fib2);
		
		for (int i = 3; i <= n; i++) {
			int fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			if (fib3 <= n) {
			System.out.println(fib3);
			} 
		}
	}
}
