import java.util.Scanner;

public class FibonnaciUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonnaci(n));
	}
	static int fibonnaci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonnaci(n-1) + fibonnaci(n-2);
		}
	}

}
