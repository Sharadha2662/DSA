import java.util.Scanner;
public class SelectionSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];
		
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		
		for (int i = 0; i <= n-2; i++) {
			//initializing ith index in min, and i in minIndex
			String min = arr[i];
			int minIndex = i;
			//comparing all elements with min, if lesser element found, keep it in  min
			for (int j = i + 1; j < n - 1; j++) {
				if(arr[j].compareTo(arr[minIndex]) < 0) {
					min = arr[j];
					minIndex = j;
				}
			}
			//swapping the min element with ith element
			String temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println("The sorted array is: ");
		for (String x : arr) {
			System.out.print(x + " ");
		}
	}

}
