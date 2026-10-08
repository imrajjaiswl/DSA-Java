package number.system;

public class PrintPalindromeNumberOneToN {

	public static void main(String[] args) {
		int n = 1000;
		for (int i = 1; i <= n; i++) {
			if (isPalindrome(i))
				System.out.println("Palindrome=> " + i);

		}

	}

	private static boolean isPalindrome(int i) {
		int n = i;
		int rev = 0;

		while (i > 0) {
			int d = i % 10;
			rev = rev * 10 + d;
			i = i / 10;
		}
		return n == rev;
	}

}
