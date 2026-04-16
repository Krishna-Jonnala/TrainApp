public class UseCase11ValidateTrain {

    public static boolean validate(String trainId, String cargoCode) {

        if (trainId == null || !trainId.startsWith("TR")) {
            return false;
        }

        if (cargoCode == null || cargoCode.isEmpty()) {
            return false;
        }

        return true;
    }
}