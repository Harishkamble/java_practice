package learning;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number= 5948576;
		int result=0;
		
		while(number>0) {
			int rem=number%10;
			number = number/10;
			result = result*10+rem;
		}
		System.out.println(result);
	}

}
