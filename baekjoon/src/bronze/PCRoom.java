package bronze;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class PCRoom {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int peopleCnt = Integer.parseInt(bf.readLine());
        String[] input = bf.readLine().split(" ");

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(input));

        System.out.println(peopleCnt - hashSet.size());
    }
}
