package number.system;

public class FindSmallestOfThreeNumbers {

	public static void main(String[] args) {
		int num1 = 1, num2 = 1, num3 = 1;
		if (num1 <= num2 && num1 <= num3)
			System.out.println("num1 is smallest");
		else if (num2 <= num1 && num2 <= num3)
			System.out.println("num2 is smallest");
		else
			System.out.println("num3 is smallest");

	}

}
