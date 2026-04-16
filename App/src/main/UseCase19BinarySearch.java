import java.util.*;

public class UseCase19BinarySearch {

    public static int search(String[] arr, String key) {
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, key);
    }
}