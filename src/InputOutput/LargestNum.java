package InputOutput;
import java.util.Scanner;


public class LargestNum {
    public static void main(String[] args) {

        System.out.print("Enter three numbers: ");

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

//        int max = num1;
//        if(num2 > max){
//            max = num2;
//        }
//        if(num3 > max){
//            max = num3;
//        }

        // OR
        // we can use Math.max() method

        int max = Math.max(num3, Math.max(num1, num2));
        System.out.println("Maximum number is: " + max);
    }
}
