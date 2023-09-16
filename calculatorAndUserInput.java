package learning;
import java.util.Scanner;

public class calculatorAndUserInput extends main {
	public static void main(String[] args) {
		Scanner one = new Scanner(System.in);
		System.out.println("Enter 2 Numbers:");
		int num1= one.nextInt();
		int num2= one.nextInt();
		System.out.println(num1);
		System.out.print(num2);
	}

}
