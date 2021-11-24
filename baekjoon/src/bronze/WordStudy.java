package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordStudy {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] intArr = new int[26];
        String inputStr = bf.readLine();
        int max = 0;
        int index = 0;

        for(int i = 0; i < inputStr.length(); i++) {
            if(inputStr.charAt(i) >= 65 && inputStr.charAt(i) <= 91) {
                intArr[inputStr.charAt(i) - 65]++;
            }
            else {
                intArr[inputStr.charAt(i) - 97]++;
            }
        }

        for(int i = 0; i < 26; i++) {
            if(intArr[i] > max) {
                max = intArr[i];
                index = i;
            }
        }

        Arrays.sort(intArr);

        if(intArr[25] == intArr[24]) {
            System.out.println("?");
        }
        else {
            System.out.println((char)(index + 65));
        }

    }
}
