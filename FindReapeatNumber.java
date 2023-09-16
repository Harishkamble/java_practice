package learning;

public class FindReapeatNumber {
	public static void main(String args[]) {
		
		int number= 159575855;
		int count=0;
		
		while(number>0) {
			int rem=number%10;
			if(rem==5) {
				count++;
			}
			number=number/10;
		}
		System.out.print(count);
	}
}