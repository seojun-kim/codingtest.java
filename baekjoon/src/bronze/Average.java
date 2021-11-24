package bronze;

import java.io.*;
import java.util.Arrays;

public class Average {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        double[] score = new double[Integer.parseInt(bf.readLine())]; //길이 입력

        String[] inputScore = bf.readLine().split(" ");

        for (int i = 0; i < score.length; i++) {
            score[i] = Double.parseDouble(inputScore[i]);
        }

        double sum = 0;
        Arrays.sort(score);

        for(int i = 0; i < score.length; i++) {
            sum += score[i] / score[score.length - 1] * 100;
        }

        System.out.println(sum / score.length);
    }
}
