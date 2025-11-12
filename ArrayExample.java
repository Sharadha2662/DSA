import java.util.Scanner;

public class ArrayExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		String[] arr = new String[size];
		
		System.out.println("Enter names to be stored");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.next();
		}
		System.out.println("The names stored in array are: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
