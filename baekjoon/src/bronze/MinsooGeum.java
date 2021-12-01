package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinsooGeum {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) - 48 < 4) {
                for(int j = 0; j < input.length() - i - 1; j++) System.out.print(7);
                break;
            }
            else if(input.charAt(i) - 48 < 7) System.out.print(4);
            else System.out.print(7);
        }

        bf.close();
    }
}
