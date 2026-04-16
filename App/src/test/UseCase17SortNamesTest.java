import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase17SortNamesTest {

    @Test
    public void test() {
        String[] arr = {"B","A"};
        assertEquals("A", UseCase17SortNames.sort(arr)[0]);
    }
}