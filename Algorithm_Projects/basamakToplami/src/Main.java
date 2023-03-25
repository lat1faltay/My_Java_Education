import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("4 basamaklı sayı giriniz: ");
        int sayi = scan.nextInt();

        int birler, onlar, yuzler, binler;

        //birler = (((sayi%1000) % 100)%10) ;

        binler = sayi / 1000 ;
        yuzler = (sayi / 100) % 10;
        onlar = (sayi / 10) % 10;
        birler = (sayi % 1000) % 10  ;

        int a = birler + onlar + yuzler + binler;


        System.out.println("Binler: " + binler + "\nYuzler: " + yuzler + "\nonlar: "+ onlar + "\nbirler: " + birler);

        System.out.println(sayi +" sayısının basamaklarının toplamı: "+ a);

    }
}