import java.util.*;
public class StudentsNameInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		String[] arr = new String[sc.nextInt()];
		sc.nextLine();;
		
		System.out.println("Enter the names to be stored: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		
		Arrays.sort(arr);
		System.out.println("Sorted list of names are:");
		for (String name: arr) {
			System.out.println(name);
		}
		System.out.println("Enter name to be searched: ");
		String key = sc.nextLine();      
		int low = 0;
		int high = arr.length - 1;
		boolean found = false;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			int res = key.compareTo(arr[mid]);
			if (res == 0) {
				System.out.println("Key found");
				found = true;
				break;
			} else if (res > 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		} 
		if (!found) {
			System.out.println("Key is not found");
		}
		sc.close();
		
	}

}
