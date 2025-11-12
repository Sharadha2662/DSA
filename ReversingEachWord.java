import java.util.Scanner;

public class ReversingEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		//Taking the string as user input
		String str = sc.nextLine();
		//Creating a new String to store reversed string
		String revstr = "";
		
		//Creating words(string type array) from string string after removing spaces
		String words[] = str.split(" ");
		
		//Traversing the words array from 0th index to last index
		for (int i = 0; i <= words.length-1; i++) {
			//creating a variable revword for storing each word in reversed format
			String revWord = "";
			//traversing each word of words array from 0th index till each word length
			for (int j = 0; j <= words[i].length() - 1; j++) {
				//storing each character of word in revword variable in reverse order
				revWord = words[i].charAt(j) + revWord;
			}
			//concatenating reverse word in revstr 
			revstr = revstr + revWord;
			//adding a space before the last word
			if (i!= words.length - 1) {
				revstr = revstr + " ";
			}
		}
		//printing the reversed string 
		System.out.println(revstr);
	}

}
