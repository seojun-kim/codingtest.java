package forStatement;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 1; i < 10; i++) {

            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
    }
}
