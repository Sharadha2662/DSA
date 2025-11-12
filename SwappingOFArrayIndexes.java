import java.util.Scanner;
public class SwappingOFArrayIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Before Swapping: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		
		int temp = arr[a1];
		arr[a1] = arr[a2];
		arr[a2] = temp;
		
		
		System.out.print("Swapped Numbers: ");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
