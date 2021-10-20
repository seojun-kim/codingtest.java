package ifProblem;

import java.util.Scanner;

public class ChooseQuadrant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int xNum = scanner.nextInt();
        int yNum = scanner.nextInt();

        if(xNum > 0) {
            if (yNum > 0) {
                System.out.println("제1사분면");
            } else {
                System.out.println("제4사분면");
            }
        }
        else {
            if(yNum > 0) {
                System.out.println("제2사분면");
            }
            else {
                System.out.println("제3사분면");
            }
        }
    }
}
