import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci dizisinin kaç elemanını görmek istersiniz: ");
        int sonSayi= scan.nextInt();

        int birinci = 1, ikinci = 1, toplam;
        System.out.println(birinci + "\n" + ikinci);


        for(int i= 0; i < sonSayi; i++){
            toplam = birinci + ikinci;
            birinci = ikinci;
            ikinci = toplam;
            System.out.println(toplam);
        }


    }
}