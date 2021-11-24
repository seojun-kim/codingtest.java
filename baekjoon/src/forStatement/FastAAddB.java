package forStatement;

import java.io.*;

public class FastAAddB {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalNum = Integer.parseInt(br.readLine());

        for(int i = 0; i < totalNum; i++) {
            int num1 = Integer.parseInt(br.readLine());
            int num2 = Integer.parseInt(br.readLine());
            int total = num1 + num2;

            bw.write(total);
            bw.flush();
            bw.close();
        }
    }
}
