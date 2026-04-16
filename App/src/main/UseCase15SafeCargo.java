public class UseCase15SafeCargo {

    public static String assign(String cargo) {
        try {
            if (cargo == null) throw new Exception();
            return "OK";
        } catch (Exception e) {
            return "Error";
        }
    }
}