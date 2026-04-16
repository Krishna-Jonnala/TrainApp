import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase16SortCapacityTest {

    @Test
    public void test() {
        List<Integer> list = Arrays.asList(3,1,2);
        assertEquals(1, UseCase16SortCapacity.sort(list).get(0));
    }
}