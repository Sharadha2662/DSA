import java.util.*;
public class SelectionSortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i <= n-2; i++) {
			//initializing ith index in min, and i in minIndex
			int min = arr[i];
			int minIndex = i;
			//comparing all elements with min, if lesser element found, keep it in  min
			for (int j = i + 1; j <= n - 1; j++) {
				if(arr[j] < arr[minIndex]) {
					min = arr[j];
					minIndex = j;
				}
			}
			//swapping the min element with ith element
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println("The sorted array is: ");
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

}
