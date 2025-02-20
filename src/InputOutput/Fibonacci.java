package InputOutput;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.print("Enter a number till you want series: ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int first = 0, second = 1;
        int count = 2;

        while (count <= n){
            int temp = second;
            second = second + first;
            first = temp;
            count++;
        }
        System.out.println(second);

//        for (int i = 0; i <= n ; i++) {
//            c = a + b;
//            System.out.println(" " + c);
//            a = b;
//            b = c;
//        }
    }
}
