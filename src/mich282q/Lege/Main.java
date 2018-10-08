package mich282q.Lege;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("indtast dit username");
        String username = scanner.nextLine();
        System.out.println("dit username " + username);




        double num1;
        double num2;
        double num3;

        Scanner input = new Scanner(System.in);
        System.out.println("put in the first number");
        num1 = input.nextDouble();

        System.out.println("put in the next second number");
        num2 = input.nextDouble();

        System.out.println("put in the next number");
        num3 = input.nextDouble();

        System.out.println("the total is " + (num1 + num2 + num3));
    }
//lave et loop
}
