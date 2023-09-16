package learning;

import java.util.Scanner;

public class inputgoal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 to 9 digit number: ");
        String input = sc.nextLine();
        int len = input.length();

        if (len < 2 || len > 10) {
            System.out.println("Invalid input, please enter a number between 3 and 9 digits.");
            return;
        }

        for (int i = 0; i <= len - 3; i++) {
            for (int j = i + 1; j <= len - 2; j++) {
                for (int k = j + 1; k <= len - 1; k++) {
                    String number = "" + input.charAt(i) + input.charAt(j) + input.charAt(k);
                    System.out.println(number);
                }
            }
        }
    }
}


