package number.system;

public class CheckSunnyNumber {

	public static void main(String[] args) {
		int num = 8;
		System.out.println(isSunny(num) ? "Sunny" : "Not");
	}

	private static boolean isSunny(int num) {
		int next = num + 1;
		int i = 1;
		while (i * i < next)
			i++;

		return i * i == next;

	}

}
