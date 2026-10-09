package number.system;

public class CheckHarshadOrNivenNumber {

	public static void main(String[] args) {
		int num = 18;
		System.out.println(isHarshad(num) ? "Harshad" : "Not Harshad");

	}

	private static boolean isHarshad(int num) {
		int n = num;
		int sum = 0;
		while (num > 0) {
			int d = num % 10;
			sum = sum + d;
			num = num / 10;
		}
		return n % sum == 0;
	}

}
