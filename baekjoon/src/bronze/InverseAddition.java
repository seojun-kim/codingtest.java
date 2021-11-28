package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InverseAddition {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");
        String xStr = input[0], yStr = input[1];
        int x, y;

        x = rev(xStr);
        y = rev(yStr);

        System.out.println(rev(String.valueOf(x + y)));
    }

    public static int rev(String num) {
        int upset = 0;

        for(int i = num.length() - 1; i >= 0; i--) {
            upset = upset * 10 + num.charAt(i) - 48;
        }

        return upset;
    }
}
