public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{23,45,67};

        int toplam = 0, ortalama = 0;
        double  ikincideger = 0, ikinciToplam = 0, adimDort,sonDeger=0;

        for (int i = 0; i < arr.length; i++) {
            toplam = toplam + arr[i];
        }
        ortalama = toplam / arr.length;


        for (int j = 0; j < arr.length; j++) {
            ikincideger = (arr[j] - ortalama);
            adimDort = Math.pow(ikincideger,2);
            ikinciToplam = ikinciToplam + adimDort;
        }

        sonDeger = ikinciToplam / arr.length;

        System.out.println(Math.sqrt(sonDeger));


    }
}