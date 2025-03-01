package InputOutput;

public class ConvertIntoBinary {
    static String to_binary(String a, String b){
        int num1 = Integer.parseInt(a, 2); // here in parameters 2 tells the java that the given number is binary.
        int num2 = Integer.parseInt(b, 2);

        int sum = num1+num2;

        String result = Integer.toBinaryString(sum);

        return result;

    }

    public static void main(String[] args) {
        String x = "1010110", y="010111";

        System.out.println(to_binary(x,y));
    }
}
