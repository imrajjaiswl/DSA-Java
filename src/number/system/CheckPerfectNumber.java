package number.system;

public class CheckPerfectNumber {

	public static void main(String[] args) {
		int num = 28;
		System.out.println(isPerfect(num) ? "Perfect" : "Not a Perfect");

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
