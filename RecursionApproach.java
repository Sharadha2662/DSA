
public class RecursionApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNum(1);
	}
	static void printNum(int num) {
		System.out.println(num);
		num++;
		if(num <= 5) {
		printNum(num);
	}
	}
}


//calling method inside its own method and gives infinity output