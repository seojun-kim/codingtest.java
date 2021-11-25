package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindromeNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String num;
        boolean check = true;

        while(true) {
            num = bf.readLine();
            check = true;

            if(num.equals("0")) break;

            for(int i = 0; i < num.length() / 2; i++) {
                if(num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                    check = false;
                    break;
                }
            }

            if(check) System.out.println("yes");
            else System.out.println("no");
        }

    }
}
