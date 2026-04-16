import java.util.*;

public class UseCase13Performance {

    public static long loopSum(List<Integer> list) {
        long start = System.nanoTime();
        int sum = 0;
        for (int n : list) sum += n;
        return System.nanoTime() - start;
    }

    public static long streamSum(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().mapToInt(Integer::intValue).sum();
        return System.nanoTime() - start;
    }
}