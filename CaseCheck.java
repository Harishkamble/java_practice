package learning;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		char ch= sc.next().trim().charAt(0);
		sc.close();
		if(ch>= 'a' && ch <= 'z') {
			System.out.print("lowercase");
		}else {
			System.out.print("uppercase");
		}
	}

}
