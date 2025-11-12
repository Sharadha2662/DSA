import java.util.*;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sqrt = Math.sqrt(n);
		if (sqrt == (int) sqrt) {
			System.out.print("Perfect Square");
		} else {
			System.out.print("Not a Perfect Square");
		}
	}
}
    