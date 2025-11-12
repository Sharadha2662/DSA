
public class StringsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Kodnest";
		System.out.println(str); //Welcome to Kodnest
		System.out.println(str.toUpperCase()); //WELCOME TO KODNEST
		System.out.println(str.toLowerCase()); //welcome to kodnest
		System.out.println(str.length()); //18
		System.out.println(str.contains("Kodnest")); //true
		System.out.println(str.startsWith("Welcome")); //true
		System.out.println(str.endsWith("Kodnest"));  //true
		System.out.println(str.charAt(5)); //m
		System.out.println(str.indexOf('d')); //13
		System.out.println(str.lastIndexOf('e'));  //15
		System.out.println(str.isEmpty()); //false
		System.out.println(str.substring(3, 15)); //come to Kodn
		System.out.println(str.substring(3));  //come to Kodnest
		System.out.println(str.replace('n', 't'));  //Welcome to Kodtest
		
		String str1 = "   Kod Nest    ";
		System.out.println(str1);   //   Kod Nest 
		System.out.println(str1.trim()); //Kod Nest
		
		
		String data = "apple, banana, grapes";
		//Convert String into String type array
		String[] fruits = data.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]); // apple banana grapes  (prints one after the other in a new line)              
			
		}
		
		String word = "Hello";
		char[] arr = word.toCharArray();
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]); // H e l l o (prints one letter after the other in a new line) 
		}
	}

}
