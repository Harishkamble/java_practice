package learning;

import java.util.*;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		int sum = addition(a,b);
//		System.out.print(sum);
//		addition(a,b);
//		System.out.print(product(a,b));
//		factorial(a);
//		average(a,b,c);
//		oddNumber(a);
		Name name = new Name();
		name.printname();
	}

//	public static void addition(int a, int b) {
//		int add = a + b;
////		return add;
//		System.out.print(add);
//
//	}
//	public static int product(int a, int b) {
//		return a*b;
//	}
//	public static void factorial(int a) {
//		int fact = 1;
//		if (a < 0) {
//			System.out.print("Invalid Input!");
//			return;
//		}
//		for (int i = a; i >= 1; i--) {
//			fact *= i;
//		}
//		System.out.print(fact);
//	}
//	
	public static void oddNumber(int a) {
		int oddNum = 0;
		for (int i = a; i > 0; i -= 2) {
			oddNum = oddNum + i;

		}
		System.out.print(oddNum);
	}
}

class Name {
	public static void printname() {
		System.out.println("Hello World!");
	}

}
