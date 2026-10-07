package number.system;


public class CheckStrongNumber {

	public static void main(String[] args) {
		int num = 146;
		System.out.println(isStrong(num) ? "Strong " : "Not a Strong");

	}

	private static boolean isStrong(int num) {
		int n = num;
		int sum = 0;
		while (num > 0) {
			int d = num % 10;
			sum += factorial(d);
			num /= 10;
		}
		return sum == n;
	}

	private static int factorial(int d) {
		if (d <= 1)
			return 1;
		return d * factorial(d - 1);
	}

}
