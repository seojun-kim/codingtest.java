import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] score;
        String[] input;
        int runCnt;
        int maxNum = 0;
        int sum = 0;

        runCnt = Integer.parseInt(bf.readLine());
        System.out.println(runCnt);

        score = new int[runCnt];
        input = bf.readLine().split(" ");
        System.out.println(input);
    }
}
