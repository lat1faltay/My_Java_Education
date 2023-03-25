import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Kaçtan: ");
        int bas = scan.nextInt();

        System.out.print("Kaça kadar: ");
        int son = scan.nextInt();

        if(son < bas){
            System.out.println("Yanlış değer girdiniz");
            System.exit(0);
        }

        for (int i = bas; i< son; i++) {
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}