import java.util.Scanner;

public class MergingTwoArrayAndBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of 1st array");
		Scanner sc = new Scanner(System.in);
		int [] arr1 = new int[sc.nextInt()];
		
		System.out.println("Enter the elements to be stored");
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the seize of 2nd array");
		int [] arr2 = new int[sc.nextInt()];
		
		System.out.println("Enter the elements to be stored");
		for (int i = 0; i <= arr2.length - 1; i++) {
			arr2[i] = sc.nextInt();
		}
		
		
		int [] arr3 = new int[arr1.length + arr2.length];
		System.out.println("Array1 elements are: ");
		 displayArray(arr1);
		 System.out.println("Array2 elements are: ");
		 displayArray(arr2);
		mergeArray(arr1, arr2, arr3);
		System.out.println("Merged array elements are: ");
		displayArray(arr3); 
		System.out.println("After sorting the merged array: ");
		bubbleSort(arr3);
		displayArray(arr3); 
	}
	static void mergeArray(int[] arr1, int[] arr2, int[] arr3) {
			for (int i = 0; i <= arr1.length - 1; i++) {
				arr3[i] = arr1[i];
			}
			int j = 0;
			for (int i = arr1.length; i <= arr3.length - 1; i++) {
				arr3[i] = arr2[j];
				j++;
			}
	}
	static void displayArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	static void bubbleSort(int[] arr) {
		for (int i = 0; i <= arr.length - 2; i++) {
			for (int j = 0; j <= arr.length - i -2; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
