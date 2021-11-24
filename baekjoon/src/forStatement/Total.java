package forStatement;

import java.util.Scanner;

public class Total {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 0;

        //System.out.println((num * (num + 1)) / 2);
        for(int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
