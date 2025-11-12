import java.util.*;

public class StringBufferCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); //16
		sb.append(" Java ");
		System.out.println(sb); //Java 
		System.out.println(sb.capacity()); //16
		sb.append(" is a programming ");
		System.out.println(sb); //Java is a programming
		System.out.println(sb.capacity()); //34
		sb.append(" object oriented language ");
		System.out.println(sb); //Java is a programming object oriented language
		System.out.println(sb.capacity()); //70
	}

}
