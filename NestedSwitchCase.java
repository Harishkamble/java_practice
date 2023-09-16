package learning;

import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String color= sc.next();
		
		switch(color){
		case "brown":
			System.out.print("It is Apple!");
			break;
		case "orange":
			System.out.print("It is Orange!");
			break;
		case "yellow":
			System.out.print("please Enter shape round or cylinder : ");
			String shape= sc.next();
			switch(shape) {
			case "round":
				System.out.print("It is Mango!");
				break;
			case "cylinder":
				System.out.print("It is Banana!");
				break;
				default:
					System.out.print("Please enter correct fruit shape");
			}
			break;
		case "green":
			System.out.print("It is Grapes!");
			break;
			default:
				System.out.print("Please enter a correct fruit color");
		}
	}

}
