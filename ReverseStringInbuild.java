import java.util.Scanner;

public class ReverseStringInbuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr = str.toCharArray();
		String reversed = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			reversed += arr[i];
		}
		System.out.print(reversed);
	}

}
