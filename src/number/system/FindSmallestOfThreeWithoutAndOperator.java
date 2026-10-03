package number.system;

public class FindSmallestOfThreeWithoutAndOperator {

	public static void main(String[] args) {
		int num1 = 11, num2 = 22, num3 = 22;
		;
		int smallest = num1;
		if (num2 < smallest)
			smallest = num2;
		else if (num3 < smallest)
			smallest = num3;
		System.out.println("Smallest num is=> " + smallest);
	}

}
