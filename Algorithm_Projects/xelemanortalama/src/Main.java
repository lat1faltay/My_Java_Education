import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];


        for(int i = 0; i < arr.length; i++){
            Random rand = new Random();
            int sayi = rand.nextInt(5);
            arr[i] = sayi;
        }

        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        int toplam = 0;
        int xtoplam = 0;
        int xort =1;
        for(int i = 0 ; i < arr.length; i++){
            xtoplam = toplam += arr[i];
            xort = xtoplam / arr.length;
        }
        System.out.println("toplam sayı: " + xtoplam );

        System.out.println("Ortalama: " + xort );





    }
}