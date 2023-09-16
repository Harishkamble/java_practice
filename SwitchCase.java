package learning;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fruit = sc.next();
		switch (fruit) {
		case "Apple":
			System.out.print("Brown in color !");
			break;
		case "Mango":
			System.out.print("yellow in color !");
			break;
		case "Orange":
			System.out.print("Orange in color !");
			break;
		case "Grapes":
			System.out.print("Green in color !");
			break;
		default:
			System.out.print("Please Enter a valid fruit");
		}
	}

}
