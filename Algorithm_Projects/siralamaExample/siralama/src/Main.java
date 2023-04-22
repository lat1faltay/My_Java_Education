import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] data = {1, 2, 46, 6, 8, 90, 5, 345, 67, 89, 4};
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println();
        System.out.println();
        // sıralanmış liste
        Arrays.sort(data);
        System.out.println("1. sıralama taktiği");
        for (int num : data) {
            System.out.println(num);
        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        // Sıralanmış tablo yazdırılıyor
        System.out.println("Sıralanmış tablo:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }


    }
}