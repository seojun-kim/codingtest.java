package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ADifficulty {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int runCnt = Integer.parseInt(bf.readLine());
        String[] input;
        int a, b;
        int dividingValue, quotient;

        for(int i = 0; i < runCnt; i++) {

            input = bf.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);

            for(int j = 1; j < a / 2; j++) {
                if(a % j == 0) {
                    dividingValue = j;
                    quotient = a / j;
                    if(j + a / j == b) {
                        System.out.println("yes");
                        break;
                    }
                }
            }
        }

    }
}
