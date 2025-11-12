import java.util.Scanner;

public class MergingOf2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of 1st Array: ");
		int[] arr1 = new int[sc.nextInt()];
		System.out.println("Enter the elements to be stored in 1st Array: ");
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter size of 2nd Array: ");
		int[] arr2 = new int[sc.nextInt()];
		System.out.println("Enter the lements to be stored in 2nd array: ");
		for (int i = 0; i <= arr2.length - 1; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int[] finalArr = new int[arr1.length + arr2.length];
		//copying 1st array to finalArr
		for (int i = 0; i <= arr1.length - 1; i++) {
			finalArr[i] = arr1[i];
		}
		
		//copying 2nd array to finalArr
		int j = arr1.length;
		for (int i = 0; i <= arr2.length - 1; i++) {
			finalArr[j] = arr2[i];
			j++;
		}
		
		
		System.out.print("First Array: ");
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		System.out.print("Second Array: ");
		for (int i = 0; i <= arr2.length - 1; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.print("Final Array: ");
		for (int i = 0; i <= finalArr.length - 1; i++) {
			System.out.print(finalArr[i] + " ");
		}
		System.out.println();
		
	}

}
