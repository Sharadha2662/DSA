import java.util.*;
public class InsertionSortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[sc.nextInt()];
		
		System.out.println("Elements of array are: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
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
