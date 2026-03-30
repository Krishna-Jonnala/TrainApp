import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogies: " + trainConsist.size());

        // UC2: Passenger bogies
        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // UC3: Unique IDs
        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // duplicate ignored

        // UC4: Ordered train using LinkedList
        System.out.println("\nCreating ordered train consist...");

        LinkedList<String> orderedTrain = new LinkedList<>();

        // Add bogies
        orderedTrain.add("Engine");
        orderedTrain.add("Sleeper");
        orderedTrain.add("AC");
        orderedTrain.add("Cargo");
        orderedTrain.add("Guard");

        System.out.println("Initial train: " + orderedTrain);

        // Insert Pantry at position 2
        orderedTrain.add(2, "Pantry");
        System.out.println("After adding Pantry at position 2: " + orderedTrain);

        // Remove first and last
        orderedTrain.removeFirst();
        orderedTrain.removeLast();

        // Final consist
        System.out.println("Final ordered train: " + orderedTrain);

        System.out.println("\nSystem ready for further operations.");
    }
}