import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase15SafeCargoTest {

    @Test
    public void test() {
        assertEquals("Error", UseCase15SafeCargo.assign(null));
    }
}