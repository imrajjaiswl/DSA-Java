package number.system;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		int num = 6767;
		System.out.println(isPalindrome(num) ? "Palindrome" : "Not palindrome");

	}

	private static boolean isPalindrome(int num) {
		int rev = 0;
		int n = num;
		while (num > 0) {
			int d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}
		return rev == n;
	}

}
