package test;

import main.Bogie;
import main.UseCase8TrainConsisntMgmt;

import java.util.*;

public class UseCase8TrainConsistMgmtTest {

    public static void main(String[] args) {

        testFilter_CapacityGreaterThanThreshold();
        testFilter_NoBogiesMatching();
        testFilter_EmptyBogieList();

        System.out.println(" All test cases passed!");
    }

    static List<Bogie> createSampleBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 70));
        list.add(new Bogie("First Class", 50));
        list.add(new Bogie("Sleeper", 80));
        return list;
    }

    static void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result =
                UseCase8TrainConsisntMgmt.filterBogiesByCapacity(createSampleBogies(), 70);

        assert result.size() == 2;
    }

    static void testFilter_NoBogiesMatching() {
        List<Bogie> result =
                UseCase8TrainConsisntMgmt.filterBogiesByCapacity(createSampleBogies(), 100);

        assert result.isEmpty();
    }

    static void testFilter_EmptyBogieList() {
        List<Bogie> result =
                UseCase8TrainConsisntMgmt.filterBogiesByCapacity(new ArrayList<>(), 60);

        assert result.isEmpty();
    }
}