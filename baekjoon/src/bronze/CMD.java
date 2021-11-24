package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CMD {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(bf.readLine());
        String[] name = new String[inputNum];
        boolean confirm;
        int longLength = 0;

        for(int i = 0; i < name.length; i++) {
            name[i] = bf.readLine();
            if(name[i].length() > longLength) longLength = name[i].length();
        }

        for(int i = 0; i < longLength; i++) {
            confirm = true;

            for(int j = 1; j < name.length; j++) {
                if(name[j - 1].charAt(i) != name[j].charAt(i)) {
                    confirm = false;
                    System.out.print("?");
                    break;
                }
            }

            if(confirm == true) System.out.print(name[0].charAt(i));
        }

        bf.close();
    }
}
