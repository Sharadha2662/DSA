import java.util.Scanner;

public class CountingConsecutiveCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		
		char currChar = str.charAt(0);
		int count = 1;
		String newStr = "";
		
		for (int i = 1; i <= str.length()-1; i++) {
			if (str.charAt(i) == currChar) {
				count++;
			} else {
				newStr = newStr + currChar + count;
			currChar = str.charAt(i);
			count = 1;
			}
		}
		newStr = newStr + currChar + count;
		System.out.println(newStr);
		sc.close();
	}

}
