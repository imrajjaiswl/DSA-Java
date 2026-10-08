package number.system;

public class CheckAutomorphicNumber {

	public static void main(String[] args) {
		int num = 5;
		System.out.println(isAutomorphic(num) ? "Automorphic" : "Not Automorphic");

	}

	private static boolean isAutomorphic(int num) {
		
		int sq = num * num;
		while (num > 0) {
			if (sq % 10 != num % 10)
				return false;
			sq = sq / 10;
			num = num / 10;
		}
		return true;
	}

}
