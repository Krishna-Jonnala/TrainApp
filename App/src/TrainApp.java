import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize train consist
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // UC2: Passenger bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("\nPassenger bogies: " + trainConsist);

        trainConsist.remove("AC Chair");
        System.out.println("After removal: " + trainConsist);

        System.out.println("Is Sleeper present? " + trainConsist.contains("Sleeper"));

        // UC3: Unique Bogie IDs using HashSet
        System.out.println("\nTracking unique bogie IDs...");

        Set<String> bogieIds = new HashSet<>();

        // Adding IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique IDs
        System.out.println("Unique Bogie IDs: " + bogieIds);

        System.out.println("\nSystem ready for further operations.");
    }
}