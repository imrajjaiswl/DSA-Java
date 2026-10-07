package number.system;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=6767;
System.out.println(reverse(num));
	}

	private static int reverse(int num) {
		int rev=0;
		while(num>0) {
			int d=num%10;
			rev=rev*10+d;//7 76 767 7676
			num/=10;
		}
		return rev;
	}

}
