import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scan.nextInt();

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }

    }
}