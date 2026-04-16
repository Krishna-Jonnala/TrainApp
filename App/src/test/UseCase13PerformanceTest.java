import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase13PerformanceTest {

    @Test
    public void test() {
        List<Integer> list = Arrays.asList(1,2,3);
        assertTrue(UseCase13Performance.loopSum(list) >= 0);
    }
}