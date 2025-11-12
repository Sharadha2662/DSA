
public class HallowRectangle {

	public static void main(String[] args) {
		//Hallow Rectangle
		int rows = 4;
		int cols = 5;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//Right Angle Triangle
		System.out.println();
		int n = 7;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Straight line
		System.out.println();
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Alternative Stars
		System.out.println();
		for (int i = 1; i <= 4; i++) {
				if (i % 2 == 1) {
					System.out.print("*");
				} else {
					System.out.print("**");
				}
				System.out.println();
			}
		
		//Descending Numeric Triangle
		System.out.println();
		int inc = 5;
		for (int i = inc; i > 0; i--) {
			for (int j = inc; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		//Ascending Alphabet Triangle
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		//Descending Alphabet Triangle
		System.out.println();
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print('A');
			}
			System.out.println();
		}
		
	}
}
