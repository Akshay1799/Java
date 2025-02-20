package InputOutput;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your amount: ");
        float amount = in.nextFloat();

        System.out.print("Enter your interest rate: ");
        float interest = in.nextFloat();

        System.out.print("Enter your time duration: ");
        float time = in.nextFloat();

        float si = (amount*interest*time)/100;

        System.out.println("Total interest is: " + si);
        System.out.println("Total payable amount is: " + (amount + si));

    }
}