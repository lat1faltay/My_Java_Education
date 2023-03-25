import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        for(int i = 1000; i < 10000; i++){

            int birler = i % 10;
            int onlar = (i / 10) % 10 ;
            int yuzler = (i / 100) % 10 ;
            int binler = (i / 1000) % 10 ;

            if(birler == binler && onlar == yuzler){
                System.out.println(i + " sayısı polindromik sayıdır");
            }


        }




    }
}
