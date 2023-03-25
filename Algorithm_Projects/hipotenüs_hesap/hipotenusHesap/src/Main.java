import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Üçgenin Hipotenüs ve üçgenin alanını hesaplayan proje");
        double a, b, hipotenus;
        Scanner scan = new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu girin: ");
        a = scan.nextDouble();
        System.out.print("2. kenar uzunluğunu girin: ");
        b = scan.nextDouble();

        hipotenus = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenüs: " + hipotenus);


    }
}