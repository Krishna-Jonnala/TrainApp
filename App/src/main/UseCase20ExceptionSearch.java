public class UseCase20ExceptionSearch {

    public static int search(String[] arr, String key) {
        try {
            for(int i=0;i<arr.length;i++)
                if(arr[i].equals(key)) return i;
        } catch(Exception e) {
            return -1;
        }
        return -1;
    }
}