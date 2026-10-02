package number.system;

public class FindLargestOfTwoNumbers {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 11;

		System.out.println(num1 > num2 ? "num1 is greater " : "num2 is greater");
		
//		Another approach
		if (num1 > num2)
			System.out.println("num1 is greater ");
		else
			System.out.println("num2 is greater");
		
	}

}
