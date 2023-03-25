public class Main {
    public static void main(String[] args) {

        // Dik Üçgen
        System.out.println("Dik Üçgen");
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}