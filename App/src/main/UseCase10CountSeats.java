import java.util.*;

public class UseCase10CountSeats {

    public static int countSeats(Map<String, Integer> bogieSeats) {
        int total = 0;

        for (int seats : bogieSeats.values()) {
            total += seats;
        }

        return total;
    }
}