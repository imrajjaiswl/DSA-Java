package number.system;

public class CheckDisariumNumber {

	public static void main(String[] args) {
		int num = 136;
		System.out.println(isDisarium(num) ? "Yes" : "Not");
	}

	private static boolean isDisarium(int num) {
		int c = (num + "").length();
		int n = num;
		int sum = 0;
		while (num > 0) {
			int d = num % 10;
			sum = sum + power(d, c--);
			num = num / 10;
		}
		return sum == n;
	}

	private static int power(int d, int c) {
		int res = 1;
		for (int i = 1; i <= c; i++)
			res = res * d;
		return res;
	}

}
