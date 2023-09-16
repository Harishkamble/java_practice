package learning;
import java.util.*;
public class chekPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int m = n / 2;
		if(m=<1 && m=<10) {
		if (m == 0 || m == 1) {
			System.out.println(n + "is prime number");
		} else {
			System.out.println(n + "is not prime number");
		}
		}
	}
}