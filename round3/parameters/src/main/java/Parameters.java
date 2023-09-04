package fi.tuni.prog3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> parameters = new ArrayList<>();

        System.out.println("Parameters:");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                scanner.close();        
                break;
            }
            parameters.add(input);
        }

        // Sort the parameters alphabetically
        Collections.sort(parameters);

        // Calculate column widths
        int col1Width = String.valueOf(parameters.size()).length() + 2; // Add 2 for padding
        int col2Width = parameters.stream().mapToInt(String::length).max().orElse(0) + 2; // Add 2 for padding

        createBorder(col1Width, col2Width, "a");

        // Print the table content
        for (int i = 0; i < parameters.size(); i++) {
            System.out.format("# %-" + (col1Width - 2) + "d | %-" + (col2Width - 2) + "s #\n", i + 1, parameters.get(i));
            if(i != parameters.size()) {
                createBorder(col1Width, col2Width, "middle");
            }
        }

        // Print the table footer
        createBorder(col1Width, col2Width, "a");
    }

    private static void createBorder(int col1Width, int col2Width, String type) {
        System.out.print("#");
        for (int i = 0; i < col1Width; i++) {
            System.out.print(type == "middle" ? "-" : "#");
        }
        System.out.print(type == "middle" ? "+" : "#");
        for (int i = 0; i < col2Width; i++) {
            System.out.print(type == "middle" ? "-" : "#");
        }
        System.out.println("#");
    }
}