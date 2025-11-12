import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		int a = dec;
		String s = "";
		while (dec != 0) {
			int res = dec % 2;
			s = res + s;
			dec = dec / 2;
		}
		System.out.print(s);
	}

}
