import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11ValidateTrainTest {

    @Test
    public void testValid() {
        assertTrue(UseCase11ValidateTrain.validate("TR123", "CG01"));
    }

    @Test
    public void testInvalid() {
        assertFalse(UseCase11ValidateTrain.validate("123", ""));
    }
}