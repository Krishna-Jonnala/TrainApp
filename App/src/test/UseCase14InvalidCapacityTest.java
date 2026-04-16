import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase14InvalidCapacityTest {

    @Test
    public void test() {
        assertThrows(IllegalArgumentException.class, () -> {
            UseCase14InvalidCapacity.check(0);
        });
    }
}