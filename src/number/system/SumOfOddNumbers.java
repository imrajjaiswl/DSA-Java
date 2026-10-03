package number.system;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 50; i += 2)
			sum = sum + i;
		System.out.println("Sum => " + sum);

	}

}
