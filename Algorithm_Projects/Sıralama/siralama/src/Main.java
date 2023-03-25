import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı 1: ");
        int sayi1 = scan.nextInt();
        System.out.print("Sayı 2: ");
        int sayi2 = scan.nextInt();
        System.out.print("Sayı 3: ");
        int sayi3 = scan.nextInt();

        int enBuyuk;

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 > sayi3) {
                System.out.println("En büyük sayı: " + sayi1 + " ortanca sayı: " + sayi2 + " En büyük sayı: " + sayi3);
            } else {
                System.out.println("En büyük sayı: " + sayi1 + " ortanca sayı: " + sayi3 + " En büyük sayı: " + sayi2);
            }
        } else if (sayi2 > sayi3 && sayi2 > sayi1) {
            if (sayi1 > sayi3) {
                System.out.println("En büyük sayı: " + sayi2 + " ortanca sayı: " + sayi1 + " En büyük sayı: " + sayi3);
            } else {
                System.out.println("En büyük sayı: " + sayi2 + " ortanca sayı: " + sayi3 + " En büyük sayı: " + sayi1);
            }
        }else{
            if (sayi2> sayi1){
                System.out.println("En büyük sayı: " + sayi3 + " ortanca sayı: " + sayi2 + " En büyük sayı: " + sayi1);
            }else {
                System.out.println("En büyük sayı: " + sayi3 + " ortanca sayı: " + sayi1 + " En büyük sayı: " + sayi2);
            }
        }

    }
}