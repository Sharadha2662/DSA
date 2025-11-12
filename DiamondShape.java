
public class DiamondShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for (int i = 2; i <= 5; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");	
				}
		
		for (int j = 5; j >= i; j--) {
			if (j == 5 || j == i) {
				System.out.print("* ");
			} else {
				System.out.print("  ");
			}
		}
		System.out.println();
		}
  }
}
