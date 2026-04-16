import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase18LinearSearchTest {

    @Test
    public void test() {
        String[] arr = {"A","B"};
        assertEquals(1, UseCase18LinearSearch.search(arr,"B"));
    }
}