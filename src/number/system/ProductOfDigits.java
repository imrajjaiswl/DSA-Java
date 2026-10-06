package number.system;

public class ProductOfDigits {

	public static void main(String[] args) {
		int num = 12345;
		System.out.println(product(num));

	}

	private static int product(int num) {
		int p = 1;
		while (num > 0) {
			int d = num % 10;
			p *= d;
			num /= 10;

		}
		return p;
	}

}
