package number.system;

public class PrintSumOfFactors {

	public static void main(String[] args) {
		int sum = 0;
		int num = 6;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				sum = sum + i;
		}
		System.out.println("Sum=>" + sum);

	}

}
