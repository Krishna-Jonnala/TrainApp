import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase12SafetyCheckTest {

    @Test
    public void testSafe() {
        assertTrue(UseCase12SafetyCheck.isSafe(100, true));
    }

    @Test
    public void testUnsafe() {
        assertFalse(UseCase12SafetyCheck.isSafe(130, false));
    }
}