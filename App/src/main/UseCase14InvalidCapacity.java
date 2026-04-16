public class UseCase14InvalidCapacity {

    public static boolean check(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException();
        return true;
    }
}