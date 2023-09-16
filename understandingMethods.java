package learning;
import java.util.*;
public class understandingMethods{
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
//		String name= sc.next();
		greet("harish");
		
	}
	public static void greet(String name) {
//		String greeting = "hello ";
		System.out.print("Hello "+name);
	}
}