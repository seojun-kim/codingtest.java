package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");

        int numerator = Integer.parseInt(input[0]); //분자
        int denominator = Integer.parseInt(input[1]); //분모
        int num = Integer.parseInt(input[2]); //n
        int result = numerator % denominator;

        for(int i = 0; i < num - 1; i++) {
            result *= 10;
            result %= denominator;
        }

        result *= 10;
        System.out.println(result / 10);

    }
}
