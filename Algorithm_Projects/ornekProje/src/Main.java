import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Romem rakamını giriniz: ");
        String romen = scan.next();

        if(romen == "I"){
            System.out.println(1);
        }else if(romen == "V"){
            System.out.println(5);
        }else if(romen == "X"){
            System.out.println(10);
        } else if (romen == "L") {
            System.out.println(50);
        } else if (romen=="C") {
            System.out.println(100);
        }else if(romen == "D"){
            System.out.println(500);
        }else if(romen == "M"){
            System.out.println(1000);
        }

        String isim = "ali";


    }
}