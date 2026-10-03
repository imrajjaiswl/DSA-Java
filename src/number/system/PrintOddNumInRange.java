package number.system;

public class PrintOddNumInRange {

	public static void main(String[] args) {
		int strt = 1;
		int end = 100;
		for (int i = strt; i <= end; i += 2)
			System.out.println("Odd Number is =>" + i);
	}

}
