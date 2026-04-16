import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10CountSeatsTest {

    @Test
    public void testSeatCount() {
        Map<String, Integer> data = new HashMap<>();
        data.put("SL", 72);
        data.put("AC", 50);

        int total = UseCase10CountSeats.countSeats(data);

        assertEquals(122, total);
    }
}