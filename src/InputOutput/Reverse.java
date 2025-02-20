package InputOutput;

public class Reverse {
    public static void main(String[] args) {

        int num = 236748;
        int answer = 0;

        while(num > 0){
            int remainder = num % 10;
             num = num / 10;
             answer = answer * 10 + remainder;
        }
        System.out.println(answer);
    }
}
