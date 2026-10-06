package number.system;

public class CountOddDigits {

	public static void main(String[] args) {
		int num = 12345;
		System.out.println(digits(num));

	}

	private static int digits(int num) {
		int count = 0;
		while (num > 0) {
			int d = num % 10;
			if (d % 2 != 0)
				count++;
			num /= 10;

		}
		return count;
	}

}
