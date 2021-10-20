package ifProblem;

import java.util.Scanner;

public class AlarmClock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        int hourAddMinute = ((hour * 60) + minute) - 45;

        if(hourAddMinute < 0) {
            System.out.printf("23시 %d분\n", 60 + hourAddMinute);
        }
        else {
            System.out.printf("%d시 %d분", hourAddMinute / 60, hourAddMinute % 60);
        }
    }
}
