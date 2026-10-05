package number.system;

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 12345;
		System.out.println(sumOf(num));

	}

	private static int sumOf(int num) {
		int sum = 0;
		while (num > 0) {
			int d = num % 10;
			sum = sum + d;
			num = num / 10;
		}
		return sum;

	}

}
