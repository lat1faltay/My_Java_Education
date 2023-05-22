import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu girin(cm) : ");
        double b = scanner.nextDouble();

        System.out.print("Kilonuzu girin(kg) : ");
        double k = scanner.nextDouble();


        b=b/100;
        double endeks  = k/(b*b);

        System.out.println(b);
        System.out.println(k);
        if(endeks <18)
        {
            System.out.print(String.format("ZAYIF vki: %f", endeks));
        }
        else if(endeks >= 18 && endeks <25)
        {
            System.out.print(String.format("NORMAL vki %f", endeks));
        }
        else if(endeks >= 25 && endeks <30)
        {
            System.out.print(String.format("KİLOLU vki: %f", endeks));
        }
        else if(endeks >= 30 && endeks <35)
        {
            System.out.print(String.format("OBEZ vki: %f", endeks));
        }
        else
        {
            System.out.print(String.format("CİDDİ OBEZ vki: %f", endeks));
        }
    }
}