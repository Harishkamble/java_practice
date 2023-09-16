package learning;
import java.util.*;
public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
//		method :1
//	if(a>b && a>c) {
//			System.out.print("a is big");
//		}else if(b>a && b>c) {
//			System.out.print("b is big");
//		}else {
//			System.out.print("c is big");
//		}
		
//		method :2
		
//		int max=a;
//		if(b>max) {
//			max=b;
//		}
//		if(c>max) {
//			max=c;
//		}
//		System.out.print(max);
		
//		method :3
		
		int max = Math.max(a, Math.max(c, b));
		System.out.print(max);
	}

}
