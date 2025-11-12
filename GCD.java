import java.util.*;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		System.out.println(a);
	}

}
