package learning;
import java.util.Scanner;

public class if_else {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		in.close();
		System.out.println("Enter a number:");
		float num1=in.nextFloat();
		if(num1 % 2 == 0) {
			System.out.println(num1+"is even number");
		}else {
			System.out.println(num1+"is odd number");
		}
	}

}
