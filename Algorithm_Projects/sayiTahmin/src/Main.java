import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

        int tahmin,  goldNumber;

        Random random = new Random();

        goldNumber = random.nextInt(100);


        System.out.println("kaç can hakkınız olsun: ");
        int can = scan.nextInt();



        for(int i = 0; i <= can+1; i++){
            System.out.println("Sayı tahmin: ");
            tahmin = scan.nextInt();

            can--;
            if (tahmin > goldNumber && can != 0){
                System.out.println("Tahmin goldnumber'dan daha büyük");
            } else if (tahmin < goldNumber  && can != 0) {
                System.out.println("Tahmin goldnumber'dan daha küçük");
            } else if (tahmin == goldNumber && can != 0) {
                System.out.println("Tebrikler");
                break;
            }else if(can == 0){
                System.out.println("Sayıyı bulamadınız :( " + goldNumber);
            }

        }




    }
}