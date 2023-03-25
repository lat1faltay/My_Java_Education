import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kilo, boy, indeks;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: " );
        boy = scanner.nextDouble();

        System.out.print("Kilonuzu giriniz: " );
        kilo = scanner.nextDouble();


        indeks = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: " + indeks);

        if(indeks < 18.5){
            System.out.println("Zayıf");
        } else if ( 18.5 >= indeks && indeks < 24.9) {
            System.out.println("ideal");
        }else if ( 24.9 >= indeks && indeks < 29.9) {
            System.out.println("şişman");
        }else if ( 18.5 >= indeks && indeks < 24.9) {
            System.out.println("Obez");

        }else if(indeks > 35){
            System.out.println("Aşırı obez");
        }


    }
}