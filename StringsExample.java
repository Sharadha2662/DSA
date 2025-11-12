import java.util.Scanner;

public class StringsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = "Sharadha";
		String s2 = new String("Nandu");
		char[] arr = {'k','o','d','n','e','s','t'};
		String s3 = new String(arr);
		
		StringBuffer st1 = new StringBuffer("Chinnu");
		StringBuilder st2 = new StringBuilder("Ammu");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(st1);
		System.out.println(st2);
		
sc.close();
	}
}
