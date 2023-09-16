package learning;

import java.util.Scanner;

public class FebonacchiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nthNumber = sc.nextInt();
		sc.close();
		int a = 0;
		int b = 1;
		int count = 2;
		while (count <= nthNumber) {
			int temp= b;
			b=b+a;
			a=temp;
			count++;
			System.out.print(b+"\n");     // this will only print number till n th number
		}
//		System.out.print(b);      this will only print n th number
	}

}
