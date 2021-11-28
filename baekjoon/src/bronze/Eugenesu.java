package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eugenesu {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String inputNum = bf.readLine();
        int[] num = new int[inputNum.length()];
        int LNum = 1, RNum = 1;
        boolean check = false;

        if(inputNum.length() == 1) {
            System.out.println("NO");
            return;
        }

        for(int i = inputNum.length() - 1; i >= 0; i--) num[i] = inputNum.charAt(i) - 48;

        for(int i = 0; i < inputNum.length(); i++) {
            LNum = 1;
            RNum = 1;

            for(int j = 0; j <= i; j++) {
                LNum *= num[j];
            }
            for(int j = i + 1; j < inputNum.length(); j++) {
                RNum *= num[j];
            }

            if(LNum == RNum) {
                check = true;
                break;
            }
        }

        if(check == true) System.out.println("YES");
        else System.out.println("NO");
    }
}
