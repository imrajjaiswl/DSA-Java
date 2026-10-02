package number.system;

public class CheckEvenOrOddUsingSwitch {

	public static void main(String[] args) {
		int num = 10;
		switch (num % 2) {
		case 0:
			System.out.println("Number is even");
			break;

		case 1:
			System.out.println("number is odd");
			break;
		}
	}

}
