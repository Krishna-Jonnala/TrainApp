import java.util.*;

public class UseCase9GroupBogies {

    public static Map<String, List<String>> groupBogies(List<String> bogies) {
        Map<String, List<String>> result = new HashMap<>();

        for (String bogie : bogies) {
            String type = bogie.substring(0, 2); // SL, AC, GN

            result.putIfAbsent(type, new ArrayList<>());
            result.get(type).add(bogie);
        }

        return result;
    }
}