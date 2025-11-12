import java.util.Scanner;

public class LinearSearchUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		//	create array by taking size as user input 
		String[] arr = new String[sc.nextInt()];
	
		//store elements in n array from user input 
		System.out.println("Enter elements to be stored in an array: ");
		for (int i = 0; i <=arr.length - 1; i++) {
			arr[i] = sc.next(); 
		}
		
		//take key as user input 
		System.out.println("Enter key to be searched: ");
		String key = sc.next();
		//traverse the array from 0th index till last index of the array
		for (int i = 0; i <= arr.length - 1; i++) {
			//while traversing if key is present at any index of an array
			if (key.equals(arr[i])) {
				//display key is found
				System.out.println("Key is found");
				// System.exit(0); it will stop once the key is found but its not the good practice to write it
				return;
			}
		}
		System.out.println("Key is not found");
	}
}
