package main;

import java.util.*;
import java.util.stream.Collectors;

public class UseCase8TrainConsisntMgmt {

    public static List<Bogie> filterBogiesByCapacity(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("Sleeper", 80));

        int threshold = 60;

        List<Bogie> filtered = filterBogiesByCapacity(bogies, threshold);
        System.out.println("Filtered Bogies (Capacity > " + threshold + "):");
        filtered.forEach(System.out::println);
    }
}