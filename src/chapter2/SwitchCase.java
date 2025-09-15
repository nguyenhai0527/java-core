package chapter2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String dayName;
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        input.nextLine();
        input.close();
        System.out.println("Day " + day + " is " + dayName);
    }
}
