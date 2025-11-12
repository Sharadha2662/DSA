import java.util.*;
public class MenuBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== Linear Search Menu ====");
        System.out.println("Press 1 for searching int element in int array");
        System.out.println("Press 2 for searching double element in double array");
        System.out.println("Press 3 for searching char element in char array");
        System.out.println("Press 4 for searching String element in String array");
        System.out.print("Enter your choice: ");
        
        int choice = sc.nextInt();
        
		switch(choice) {
		case 1:
			searchInIntArray(sc);
			break;
			
		case 2:
			searchInStringArray(sc);
			break;
			
		case 3:
			searchInDoubleArray(sc);
			break;
			
		case 4:
			searchInCharArray(sc);
			break;
			
		default:
			System.out.println("Invalid Choice");
		}
		
	}
	
	static void searchInIntArray(Scanner sc) {
//		create array by taking size as user input
		System.out.println("Enter the size of array: ");
			int[] arr = new int[sc.nextInt()];
			
			//store elements in n array from user input 
			System.out.println("Enter elements to be stored in an array: ");
			for (int i = 0; i <=arr.length - 1; i++) {
				arr[i] = sc.nextInt(); 
			}
				//take key as user input 
				System.out.println("Enter key to be searched: ");
				int key = sc.nextInt();
				//traverse the array from 0th index till last index of the array
				for (int i = 0; i <= arr.length - 1; i++) {
					//while traversing if key is present at any index of an array
					if (key == arr[i]) {
						//display key is found
						System.out.println("Key is found");
						// System.exit(0); it will stop once the key is found but its not the good practice to write it
						return;
					}
				}
				System.out.println("Key is not found");
			}
			
	
	static void searchInStringArray(Scanner sc) {
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
	
	static void searchInDoubleArray(Scanner sc) {
//		create array by taking size as user input
		System.out.println("Enter the size of array: ");
			double[] arr = new double[sc.nextInt()];
			
			//store elements in n array from user input 
			System.out.println("Enter elements to be stored in an array: ");
			for (int i = 0; i <=arr.length - 1; i++) {
				arr[i] = sc.nextDouble(); 
			}
				//take key as user input 
				System.out.println("Enter key to be searched: ");
				double key = sc.nextDouble();
				//traverse the array from 0th index till last index of the array
				for (int i = 0; i <= arr.length - 1; i++) {
					//while traversing if key is present at any index of an array
					if (key == arr[i]) {
						//display key is found
						System.out.println("Key is found");
						// System.exit(0); it will stop once the key is found but its not the good practice to write it
						return;
					}
				}
				System.out.println("Key is not found");
	}
	
	static void searchInCharArray(Scanner sc) {
//		create array by taking size as user input
		System.out.println("Enter the size of array: ");
			char[] arr = new char[sc.nextInt()];
			
			//store elements in n array from user input 
			System.out.println("Enter elements to be stored in an array: ");
			for (int i = 0; i <=arr.length - 1; i++) {
				arr[i] = sc.next().charAt(0); 
			}
				//take key as user input 
				System.out.println("Enter key to be searched: ");
				int key = sc.next().charAt(0);
				//traverse the array from 0th index till last index of the array
				for (int i = 0; i <= arr.length - 1; i++) {
					//while traversing if key is present at any index of an array
					if (key == arr[i]) {
						//display key is found
						System.out.println("Key is found");
						// System.exit(0); it will stop once the key is found but its not the good practice to write it
						return;
					}
				}
				System.out.println("Key is not found");
	}

}
