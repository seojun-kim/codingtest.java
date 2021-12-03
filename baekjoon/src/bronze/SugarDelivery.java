package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(bf.readLine());
        int num = input;
        int cnt;

        cnt = input / 5;
        input %= 5;

        while(true) {
            if(input % 3 == 0) {
                cnt = cnt + (input / 3);
                break;
            }
            if(input == num) {
                cnt = -1;
                break;
            }
            input += 5;
            cnt--;
        }

        System.out.println(cnt);
    }
}
