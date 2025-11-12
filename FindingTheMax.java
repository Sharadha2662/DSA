import java.util.Scanner;

public class FindingTheMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("Enter the elements to be stored in an array: ");
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.print("The maximum element is: ");
		System.out.println(max);
	}

}
