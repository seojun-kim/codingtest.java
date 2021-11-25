package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddCycle {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(bf.readLine());
        if(inputNum < 10) inputNum *= 10;

        int cnt = 0;
        int newInt = inputNum, subInt;

       while(true) {

           subInt = (newInt / 10) + (newInt % 10);
           newInt = ((newInt % 10) * 10) + (subInt % 10);
           cnt++;

           if(newInt == inputNum) {
               System.out.println(cnt);
               break;
           }

       }


    }
}
