package InputOutput;

import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {

        int[] num = new int[10];
        System.out.print("Enter 10 numbers: ");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i<num.length; i++){
            num[i] = input.nextInt();
        }

        System.out.print("Even number: " );
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0){
                System.out.println(num[i]);
            }

        }

        System.out.println("Odd numbers: ");
        for (int i = 0; i<num.length; i++){
            if (num[i] % 2 != 0) {
                System.out.println(num[i]);
            }
        }

    }
}
