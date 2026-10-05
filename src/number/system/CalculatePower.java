package number.system;

public class CalculatePower {

	public static void main(String[] args) {
		int n = 2, p = 3;
		System.out.println(power(n, p));

	}

	private static int power(int n, int p) {
		int res = 1;
		for (int i = 1; i <= p; i++)
			res = res * n;
		return res;
	}

}
