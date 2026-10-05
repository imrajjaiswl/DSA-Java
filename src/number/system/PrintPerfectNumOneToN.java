package number.system;

public class PrintPerfectNumOneToN {

	public static void main(String[] args) {
		int n = 1000;
		for (int i = 1; i <= n; i++) {
			if (isPerfect(i))
				System.out.println(i);
		}

	}

	private static boolean isPerfect(int num) {
		int sum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				sum = sum + i;
		}
		return sum == num;
	}

}
