package InputOutput;

public class CountOccurence {
    public static void main(String[] args) {

        int n = 2346414;
        int count = 0;

        while(n > 0){
            int remainder = n % 10;
            if( remainder == 4){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
