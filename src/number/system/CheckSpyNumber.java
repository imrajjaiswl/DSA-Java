package number.system;

public class CheckSpyNumber {

	public static void main(String[] args) {
		int num = 1124;
		System.out.println(isSpy(num) ? "Spy" : "Not Spy");
	}

	private static boolean isSpy(int num) {
		int sum = 0;
		int pro = 1;
		while (num > 0) {
			int d = num % 10;
			sum += d;  
			pro *= d;
			num /= 10;
		}
		return sum == pro;
	}

}
