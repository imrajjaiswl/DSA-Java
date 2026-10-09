package number.system;

public class CheckPowerOfTwo {

	public static void main(String[] args) {
		int num = 33;
		System.out.println(isPowerOfTwo(num) ? "Yes" : "Not");

	}

	private static boolean isPowerOfTwo(int num) {
		if (num <= 1)
			return false;
		while (num % 2 == 0)
			num = num / 10;
		return num == 1;
	}

}
