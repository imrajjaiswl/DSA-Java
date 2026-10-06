package number.system;

public class ProductOfOddDigits {

	public static void main(String[] args) {
		int num = 123456;
		System.out.println(product(num));

	}

	private static int product(int num) {
		int p = 1;
		while (num > 0) {
			int d = num % 10;
			if (d % 2 != 0)
				p *= d;
			num /= 10;
		}
		return p;
	}

}
