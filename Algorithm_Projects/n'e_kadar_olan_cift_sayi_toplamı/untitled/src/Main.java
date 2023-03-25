public class Main {
    public static void main(String[] args) {

        int sayi = -10;
        int toplam = 0;

        if(sayi>0){
            for (int i = 0; i <= sayi; i++) {
                if (i % 2 == 0 && sayi>0) {
                    toplam += i;
                }
            }
            System.out.println(toplam);
        }else{
            System.out.println("Sayı 0'dan küçüktür");
        }





    }
}