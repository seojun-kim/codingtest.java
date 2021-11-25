package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MostDrains {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(bf.readLine());
        int about = 0;
        int cnt = 0;
        int num;

        while(about < x) {
            about += cnt + 1;
            cnt++;
        }
        num = about - x + 1;

        if(cnt % 2 == 0) {
            System.out.printf("%d/%d", (cnt + 1) - num, num);
        }
        else {
            System.out.printf("%d/%d", num, (cnt + 1) - num);
        }

        bf.close();
    }
}
