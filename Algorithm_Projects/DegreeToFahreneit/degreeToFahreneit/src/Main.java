import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double celcius = scan.nextInt();
        double fahrenheit;
        fahrenheit = (celcius * 1.8) + 32;
        System.out.println("Sıcaklık değeri " +fahrenheit + " fahrenheittir.");
    }
}