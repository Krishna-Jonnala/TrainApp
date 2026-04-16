public class UseCase12SafetyCheck {

    public static boolean isSafe(int speed, boolean brakeWorking) {
        return speed < 120 && brakeWorking;
    }
}