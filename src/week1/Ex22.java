package week1;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        String password = "carrot";
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type the password: ");
            String inputPassword = reader.nextLine();
            if (password.equals(inputPassword)){
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println();
        System.out.println("The secret is: iryy qbar!");
    }
}
