import java.util.*;

public class InsertionSortDescendingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Elements to be stored are: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		
		int n = arr.length;
		for (int i = 1; i <= n - 1; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < temp) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
		System.out.println("The sorted array is");
		for (int x: arr) {
		System.out.print(x + " ");
	}
		
	}

}
