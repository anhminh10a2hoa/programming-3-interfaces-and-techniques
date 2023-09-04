package fi.tuni.prog3;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers:");
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");
        scanner.close();

        double[] numbers = new double[inputNumbers.length];

        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Double.parseDouble(inputNumbers[i]);
        }

        Arrays.sort(numbers);

        double median;

        if (numbers.length % 2 == 0) {
            median = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        } else {
            median = numbers[numbers.length / 2];
        }

        System.out.println("\nMedian: " + median);
    }
}