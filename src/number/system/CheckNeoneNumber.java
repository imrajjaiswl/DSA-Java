package number.system;

public class CheckNeoneNumber {

	public static void main(String[] args) {
		int num = 8;
		System.out.println(isNeon(num) ? "Neon" : "Not a Neon");
	}

	private static boolean isNeon(int num) {
		int n = num;
		int sq = num * num;
		int sum = 0;
		while (sq > 0) {
			int d = sq % 10;
			sum += d;
			sq /= 10;
		}
		return sum == n;
	}

}
