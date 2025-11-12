import java.util.*;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.append(" is a");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.append(" programming");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.append(" language");
		System.out.println(sb);
		System.out.println(sb.length());
	}
}
