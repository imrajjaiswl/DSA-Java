package number.system;

public class ToCountStrongNumberOneToN {

	public static void main(String[] args) {
		int n = 1000;
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (isStrong(i)) {
				c++;
				System.out.println(i);
			}
		}
		System.out.println(c);
	}

	private static boolean isStrong(int i) {
		int n1 = i;
		int sum = 0;
		while (i > 0) {
			int d = i % 10;
			sum = sum + factorial(d);
			i = i / 10;
		}
		return sum == n1;
	}

	private static int factorial(int d) {
		if (d <= 1)
			return 1;
		return d * factorial(d - 1);
	}

}
