
public class ReversePreservingWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I Love Programming";
		char[] arr = str.toCharArray();
		char[] newArr = new char[arr.length];
		
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == ' ') {
				newArr[i] = ' ';
			}
		}
		int j = newArr.length - 1;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] != ' ') {
				while (newArr[j] == ' ') {
					j--;
				}
				newArr[j] = arr[i];
				j--;
			}
		}
			String revstr = new String(newArr);
			System.out.print(revstr);
		}
	}


