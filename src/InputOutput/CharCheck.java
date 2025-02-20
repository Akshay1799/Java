package InputOutput;

import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {

        System.out.print("Enter a any alphabet: ");
        Scanner in = new Scanner(System.in);

        char character = in.next().trim().charAt(0);

        if (character >= 'a' && character <= 'z'){
            System.out.println("Lowercase");
        }else{
            System.out.println("Uppercase");
        }

    }
}
