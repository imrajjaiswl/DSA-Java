package number.system;

public class FindLargestOfThreeWithoutAndOperator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 90;
		int largest = num1;
		if (num2 > largest)
			largest = num2;
		if (num3 > largest)
			largest = num3;
		System.out.println("Largest num is=> " + largest);
	}

}
