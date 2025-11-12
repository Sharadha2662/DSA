import java.util.*;

public class SelectionSortDescendingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int[] arr = new int[sc.nextInt()];
		
		System.out.println("Elements to be stored in the array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		
		int n = arr.length;
		for (int i = 0; i <= n - 2; i++) {
			int min = arr[i];
			int minIndex = i;
			for (int j = i + 1; j <= n - 1; j++) {
				if (arr[j] > arr[minIndex]) {
					min = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
		System.out.println("The sorted array: ");
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
