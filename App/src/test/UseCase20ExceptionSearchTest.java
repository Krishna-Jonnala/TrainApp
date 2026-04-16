import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase20ExceptionSearchTest {

    @Test
    public void testSearchFound() {
        String[] arr = {"SL1", "AC1", "GN1"};

        int result = UseCase20ExceptionSearch.search(arr, "AC1");

        assertEquals(1, result);
    }

    @Test
    public void testSearchNotFound() {
        String[] arr = {"SL1", "AC1", "GN1"};

        int result = UseCase20ExceptionSearch.search(arr, "XX1");

        assertEquals(-1, result);
    }

    @Test
    public void testNullArray() {
        int result = UseCase20ExceptionSearch.search(null, "A");

        assertEquals(-1, result);
    }
}