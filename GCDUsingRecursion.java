import java.util.Scanner;

public class GCDUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(findGCD(a, b));
	}
	
	static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return findGCD(b, a%b);
		}
	}

}
