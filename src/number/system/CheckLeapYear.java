package number.system;

public class CheckLeapYear {

	public static void main(String[] args) {
		int year = 1990;
		System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
	}

	static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		return false;

	}

}
