package number.system;

public class PrintDivisorsOfNumber {

	public static void main(String[] args) {
		int num = 50;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.println("Divisor => " + i);
		}

	}

}
