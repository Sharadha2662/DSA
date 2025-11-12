import java.util.Scanner;
public class AddTwoArraysCorrespondingly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the elements of array: ");
		String str1 = sc.nextLine().trim();
		System.out.println("Enter the elements of array: ");
		String str2 = sc.nextLine().trim();
		
		str1 = str1.replace("[", "").replace("]", "");
		str2 = str2.replace("[", "").replace("]", "");
		
		String [] arrStr1 = str1.split(", ");
		String [] arrStr2 = str2.split(", ");
		
		int[] arr1 = new int[arrStr1.length];
		int[] arr2 = new int[arrStr2.length];
		
		 for (int i = 0; i < arrStr1.length; i++) {
	            arr1[i] = Integer.parseInt(arrStr1[i]);
	        }
	        for (int i = 0; i < arrStr2.length; i++) {
	            arr2[i] = Integer.parseInt(arrStr2[i]);
	        }
	        
	        int [] arr3 = new int[arr1.length];
	        for (int i = 0; i < arr3.length; i++) {
				arr3[i] = arr1[i] + arr2[i];
	        }
	        
	        for (int i = 0; i < arr3.length - 1; i++) {
	        	for (int j = 0; j < arr3.length - i - 1; j++) {
	        		if (arr3[j] > arr3[j + 1]) {
	        			int temp = 0; 
	        			arr3[j] = arr3[j + 1];
	        			arr3[j + 1] = temp;
	        		}
	        	}
	        }
	        System.out.print("[");
	        for (int i = 0; i < arr3.length; i++) {
	        	System.out.print(arr3[i]);
	        	if (i != arr3.length - 1) {
	        		System.out.print(", ");
	        	}
	        }
	        System.out.print("]");
	        
	}
}
