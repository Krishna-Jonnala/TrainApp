import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize train consist
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // UC2: Add Passenger Bogies
        System.out.println("\nAdding passenger bogies...");

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display bogies
        System.out.println("Bogies after addition: " + trainConsist);

        // Remove a bogie
        System.out.println("\nRemoving AC Chair bogie...");
        trainConsist.remove("AC Chair");

        // Check existence
        System.out.println("Is Sleeper present? " + trainConsist.contains("Sleeper"));

        // Final list
        System.out.println("Final bogie list: " + trainConsist);

        System.out.println("\nSystem ready for further operations.");
    }
}