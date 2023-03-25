import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        double price;
        double rate = 18;
        System.out.print("Lütfen kdv tutarını hesaplamak istediğiniz ürünün fiyatını giriniz: ");
        price = scanner.nextDouble();
        double kdvPrice = (price * (rate/100) );
        System.out.println("KDV tutarı : " + kdvPrice);
        */

        double price, kdvPrice = 0, rate, productType;

        System.out.print("Lütfen kdv tutarını hesaplamak istediğiniz ürünün fiyatını giriniz: ");
        price = scanner.nextDouble();
        System.out.print("Aldığınız ürün teknolojik alet ise 1 gıda ürünü ise 2 seçeneğini giriniz: ");
        productType = scanner.nextDouble();


        if (productType == 1){
            kdvPrice = 0.18;
        } else if (productType == 2) {
            kdvPrice = 0.8;
        }else{
            System.out.println("ürün tipünü yanlış girdiniz...");
            System.exit(0);
        }

        System.out.println("Aldığınız ürünün kdv tutarı: " + price * kdvPrice );



    }
}