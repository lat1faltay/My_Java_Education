public class Main {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Geçtiniz");
                break;
 // case 'B' değerine bir çıktı vermezsek bir sonraki case'in çıktısını kendi çıktısı gibi kullanır. aynı değerleri yazdırmak istersek bu şekilde kullanabiliriz
            case 'B':
            case 'C':
                System.out.println("Geçtiniz");
                break;
            case 'D':
                System.out.println("Kötü");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz!");

        }

    }
}