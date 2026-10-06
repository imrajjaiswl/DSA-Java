package number.system;

public class SumOfEvenDigit {

	public static void main(String[] args) {
		int num = 12344;
		System.out.println(sumOf(num));

	}

	private static int sumOf(int num) {
		int sum = 0;
		while (num > 0) {
			int d = num % 10;
			if (d % 2 == 0)
				sum += d;
			num /= 10;

		}
		return sum;
	}

}
