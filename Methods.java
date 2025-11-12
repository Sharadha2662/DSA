
public class Methods {
	public static void main(String[] args) {
		add();
		sub(10, 25);
		int mulRes = mul(); 
		System.out.println(mulRes);
		int p = 80, q = 67;
		int divRes = div(p,q);
		System.out.println(divRes);
	}
	
	public static void add() { //without parameters and return values
		int a = 10, b = 20;
		int res = a + b;
		System.out.println(res);
	}
	
	public static void sub(int a, int b) { // with parameters and without return value
		int res = a - b;
		System.out.println(res);
	}
	
	static int mul() { //without parameters and with return type
		int a = 7, b = 9;
		int mulRes = a * b;
		return mulRes;
	}
	
	static int div(int p, int q) { //with parameters and with return type
		int divRes = p/q;
		return divRes;
	}
}
