import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {1,2,46,6,8,90,5,345,67,89,4};
        for(int i = 0; i< data.length; i++){
            System.out.println(data[i]);
        }
        Arrays.sort(data);

        // sıralanmış liste
        System.out.println("1. sıralama tantiği");
        for(int num : data){
            System.out.println(num);
        }
        
    }
}