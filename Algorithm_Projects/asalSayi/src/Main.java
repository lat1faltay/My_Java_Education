import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaça kadar kontrol edilsin: ");
        int sayi = scan.nextInt();

        boolean asalmi = false;

        for (int i = 2; i < sayi; i++) {
           if(sayi%i==0){
               asalmi = false;
               break;
           }else{
               asalmi=true;
           }
        }

        if(asalmi== true){
            System.out.println("Sayı asaldır");
        }else{
            System.out.println("Sayı asal değildir");
        }


    }
}