import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int not1, not2;
        System.out.println("1. Notu giriniz: ");
        not1 = input.nextInt();

        System.out.println("1. Notu giriniz: ");
        not2 = input.nextInt();

        double sonuc = (not1 * 0.4 ) + (not2 * 0.6);


        System.out.println("Sınavların ortalaması: "+sonuc);

        }
    }
