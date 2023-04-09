import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = scan.nextInt();

        if(a%2 == 0){
            System.out.println("Sayı çifttir");
        }else{
            System.out.println("Sayı tektir");
        }
        System.out.println();

    }
}