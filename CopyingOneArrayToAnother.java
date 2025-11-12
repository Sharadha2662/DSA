import java.util.Scanner;

public class CopyingOneArrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[sc.nextInt()];
		
		for (int i = 0; i <= arr1.length - 1; i++)  {
			arr1[i] = sc.nextInt(); 
		}
		
		int arr2[] = new int[arr1.length];
		
		for (int i = 0; i <= arr1.length - 1 ; i++) {
			arr2[i] = arr1[i];
		}
		System.out.print("Original Scores: ");
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.println(arr1[i] + " ");
		}
		
		System.out.print("Copied Scores: ");
		for (int i = 0; i <= arr2.length - 1; i++) {
			System.out.println(arr2[i] + " ");
		}
	}

}
