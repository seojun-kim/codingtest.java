package forStatement;

import java.util.Scanner;

public class AAddB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputCount = scanner.nextInt();

        for(int i = 0; i < inputCount; i++) {

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println(num1 + num2);
        }
    }
}
