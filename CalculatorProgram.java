package learning;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int result=0;
//		sc.close();
		while (true) {
			System.out.print("\nEnter operator: ");
			char op = sc.next().trim().charAt(0);
			System.out.print("");
			if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				System.out.print("Enter two numbers: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				if(op=='+') {
					result= num1+num2;
				}
				if(op=='-') {
					result= num1-num2;
				}
				if(op=='*') {
					result= num1*num2;
				}
				if(op=='/') {
					if(num2 !=0) {
					result= num1/num2;
					}
				}
				if(op=='%') {
					result= num1%num2;
				}
			}else if (op =='x' || op == 'X') {
				break;
			}else {
				System.out.print("invalid operation");
			}
			System.out.print(result);
		}
	}
} 
