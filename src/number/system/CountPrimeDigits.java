package number.system;

public class CountPrimeDigits {

	public static void main(String[] args) {
		int num = 1234567;
		System.out.println(count(num));

	}

	private static int count(int num) {
		int count = 0;
		while (num > 0) {
			int d = num % 10;
			if (isPrime(d))
				count++;
			num /= 10;
		}
		return count;
	}

	private static boolean isPrime(int d) {
		if (d <= 1)
			return false;
		for (int i = 2; i <= d / 2; i++) {
			if (d % i == 0)
				return false;
		}
		return true;
	}

}
