package number.system;

public class CountFactorsOfNumber {

	public static void main(String[] args) {
		int num=50;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		System.out.println("Factor count is => "+count);
	}

}
