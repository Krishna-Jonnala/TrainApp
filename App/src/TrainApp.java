import java.util.*;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC7: Create passenger bogies as objects
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 24));

        // Sort bogies by capacity (ascending)
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display sorted bogies
        System.out.println("\nPassenger Bogies sorted by capacity:");
        for (Bogie bogie : passengerBogies) {
            System.out.println(bogie);
        }

        System.out.println("\nSystem ready for further operations.");
    }
}