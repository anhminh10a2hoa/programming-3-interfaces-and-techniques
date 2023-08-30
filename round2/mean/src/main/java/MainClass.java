package fi.tuni.prog3;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] numbers = input.split(" ");
        double sum = 0;

        for (String number : numbers) {
            sum += Double.parseDouble(number);
        }

        double mean = sum / numbers.length;
        System.out.println("Mean: " + mean);
    }
}