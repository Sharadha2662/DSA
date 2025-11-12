import java.util.Scanner;

public class BubbleSortDescendingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		String [] arr = new String[sc.nextInt()];
		sc.nextLine();
		
		System.out.println("Enter the elemnets of tha array: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.next();
		}
		
		int n = arr.length;
		for (int i = 0; i <= n - 2; i++) { //iterations
			for (int j = 0; j <= n - i - 2; j++) {  //comparision in each iteration
				if (arr[j].compareTo(arr[j + 1]) < 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted array: ");
		for (String x : arr) {
			System.out.print(x + " ");
		}
	}

}