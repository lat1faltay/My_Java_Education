public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 2;

        boolean varMi = false;

        /*
        int a= 0;

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println();
            a = sayilar[i];
            if(a == aranacak){
                System.out.println("Sayı bulundu!!");
            }else{
                System.out.println("sayı bulunamadı");
            }

        } */

        for(int sayi : sayilar){
            if(sayi == aranacak){
                varMi = true;
                break;
            }
        }

        if(varMi==true){
            System.out.println("Sayı mevcuttur");
        }else {
            System.out.println("Sayı mevcut değildir");
        }

    }
}