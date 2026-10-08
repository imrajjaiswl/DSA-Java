package number.system;

public class CheckArmStrongNumber {
	public static void main(String[] args) {
		int num = 1533;
		System.out.println(isArmstrong(num) ? "Armstrong" : "Not a Armstrong");
	}

	private static boolean isArmstrong(int num) {
		int count = (num + "").length();
		int sum = 0;
		int n = num;
		while (num > 0) {
			int d = num % 10;
			sum = sum + power(d, count);
			num = num / 10;
		}
		return sum == n;

	}

	private static int power(int d, int count) {
		int res = 1;
		for (int i = 1; i <= count; i++) {
			res = res * d;
		}
		return res;
	}

}
