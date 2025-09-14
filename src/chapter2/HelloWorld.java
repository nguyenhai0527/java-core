package chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Student score!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of students: ");
        String input = scanner.nextLine();

        String[] names = input.split(", ");
        int[] scores = new int[names.length];
        int totalScore = 0;
        double averageScore;
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;
        String maxScoreStudent = "";
        String minScoreStudent = "";

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter score for " + names[i] + ": ");
            scores[i] = scanner.nextInt();
            totalScore += scores[i];

            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxScoreStudent = names[i];
            }
            if (scores[i] < minScore) {
                minScore = scores[i];
                minScoreStudent = names[i];
            }
        }
        averageScore = (double) totalScore / names.length;

        System.out.println("Total score: " + totalScore);
        System.out.printf("Average score: %.2f%n", averageScore);
        System.out.println("Highest score: " + maxScore + " by " + maxScoreStudent);
        System.out.println("Lowest score: " + minScore + " by " + minScoreStudent);
        System.out.println("All scores: " + Arrays.toString(scores));
        scanner.close();
    }
}
