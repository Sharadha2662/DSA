import java.util.Scanner;

public class ReplacingVowelsWithStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String name = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (isVowel(ch)) {
				name += '*';
			} else {
				name += ch;
			}
		}
		System.out.println(name);
	}
	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	}

}
