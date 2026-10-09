package number.system;

public class CheckDuckNumber {

	public static void main(String[] args) {
		int num = 240;
		System.out.println(isDuck(num) ? "Duck" : "Not a Duck");

	}

	private static boolean isDuck(int num) {

		while (num > 0) {
			int d = num % 10;
			if (d == 0)
				return true;
			num = num / 10;
		}
		return false;
	}

}
