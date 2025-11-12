import java.util.Scanner;

public class ReersingOneToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] arr1 = new int[sc.nextInt()];
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[arr1.length];
		
		int j = arr2.length - 1;
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr2[j] = arr1[i];
			j--;
		}
		System.out.print("Original Scores: ");
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.print("Reversed Scores: ");
		for (int i = 0; i <= arr2.length - 1; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
