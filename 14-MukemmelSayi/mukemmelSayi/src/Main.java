public class Main {
    public static void main(String[] args) {

        // 6 --> 1, 2, 3

        int number = 28;
        int total = 0;


        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (number == total) {
            System.out.println("Girilen sayı mükemmel sayıdır");
        }else {
            System.out.println("Sayı mükemmel sayı değildir");
        }


    }
}