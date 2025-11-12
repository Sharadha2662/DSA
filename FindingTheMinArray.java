import java.util.Scanner;

public class FindingTheMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("Enter the lements to be stored in an array: ");
		int[] arr = new int[n];
		
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print("The minimum element is: ");
		System.out.println(min);
	}

}
