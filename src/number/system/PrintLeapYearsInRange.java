package number.system;

public class PrintLeapYearsInRange {

	public static void main(String[] args) {

		int strtYear = 2000, endYear = 2024;
		for (int i = strtYear; i <= endYear; i++) {
			if (isLeapYear(i))
				System.out.println("Leap Year=> " + i);
		}

	}

	static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		return false;
	}

}
