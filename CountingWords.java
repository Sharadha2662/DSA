import java.util.*;

public class CountingWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		int Count = words.length;
		System.out.println(Count);
		
	}
}
