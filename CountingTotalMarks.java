import java.util.Scanner;

public class CountingTotalMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("No. of Students Marks: ");
		int n = sc.nextInt();
		int totalMarks = 0;
		
		
		for (int i = 0; i < n; i++) {
			int marks = sc.nextInt();
			totalMarks += marks;
		}
		System.out.println("Total Marks: " + totalMarks);
	}

}
