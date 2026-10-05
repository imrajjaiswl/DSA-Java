package number.system;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int num = 12345;
		System.out.println(countDigits(num));
	}

	private static int countDigits(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;

	}

}
