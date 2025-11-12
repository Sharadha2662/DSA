
public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count--;
			}
			System.out.println();
		}
		
		System.out.println();
		int var = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(var + " ");
				var++;
			}
			System.out.println();
		}
		
		System.out.println();
		int dec = 10;
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(dec + " ");
				dec--;
			}
			System.out.println();
		}
	}

}
