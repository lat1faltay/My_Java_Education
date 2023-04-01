import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{32, 56, 43, 79, 76, 98, 54, 12};

        Arrays.sort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}