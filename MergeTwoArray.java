import java.util.*;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		String str1 = "[10, 20, 30]";
		String str2 = "[40, 80, 60]";
		
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
	        
		int[] arr3 = new int[arr1.length + arr2.length];
		
		mergeArray(arr1, arr2, arr3);
		bubbleSorting(arr3);
		
		System.out.print("[");
		for (int i = 0; i <= arr3.length - 1; i++) {
			if (i < arr3.length - 1) {
				System.out.print(arr3[i] + ", ");
			} else {
				System.out.print(arr3[i]);
			}
		}
		System.out.print("]");
	}
	static void mergeArray(int[] arr1, int [] arr2, int[] arr3) {
		for (int i = 0; i <= arr1.length - 1; i++) {
			arr3[i] = arr1[i];
		}
		
		int j = 0;
		for (int i = arr1.length ; i <= arr3.length - 1; i++) {
			arr3[i] = arr2[j];
			j++;
		}
	}
		static void bubbleSorting(int[] arr3) {
			for (int i = 0; i <= arr3.length - 2; i++) {
				for (int j = 0; j <= arr3.length - i - 2; j++) {
					if (arr3[j] > arr3[j + 1]) {
						int temp = arr3[j];
						arr3[j] = arr3[j + 1];
						arr3[j + 1] = temp;
					}
				}
			}
		}
}



