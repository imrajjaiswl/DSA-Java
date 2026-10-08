package number.system;

public class PrintPrimeNumberOnetToN {

	public static void main(String[] args) {
		int n = 1000;
		for (int i = 1; i <= n; i++) {
			if (isPrime(i))
				System.out.println("Prime Number is:" + i);
		}
	}

	private static boolean isPrime(int i) {
		if (i <= 1)
			return false;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0)
				return false;
		}
		return true;
	}

}
