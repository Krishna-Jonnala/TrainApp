import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase19BinarySearchTest {

    @Test
    public void testSearchFound() {
        String[] arr = {"SL1", "AC1", "GN1"};

        int index = UseCase19BinarySearch.search(arr, "AC1");

        assertTrue(index >= 0);
    }

    @Test
    public void testSearchNotFound() {
        String[] arr = {"SL1", "AC1", "GN1"};

        int index = UseCase19BinarySearch.search(arr, "XX1");

        assertEquals(-1, index);
    }
}