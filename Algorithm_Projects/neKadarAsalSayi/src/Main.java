public class Main {
    public static void main(String[] args) {



        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean kontrol = false;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = false;
                    break;
                }
            }
            if (kontrol == true) {
                System.out.println(sayi);
            }
        }

    }
}