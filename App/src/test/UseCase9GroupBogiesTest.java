import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9GroupBogiesTest {

    @Test
    public void testGrouping() {
        List<String> bogies = Arrays.asList("SL1", "SL2", "AC1", "GN1");

        Map<String, List<String>> result =
                UseCase9GroupBogies.groupBogies(bogies);

        assertEquals(2, result.get("SL").size());
        assertEquals(1, result.get("AC").size());
    }
}