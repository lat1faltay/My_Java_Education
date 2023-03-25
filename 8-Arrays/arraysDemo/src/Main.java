public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "Latif";
        String ogrenci2 = "Deniz";
        String ogrenci3 = "Ece";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);




        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Latif";
        ogrenciler[1] = "Deniz";
        ogrenciler[2] = "Ece";

        for (int i = 0; i<ogrenciler.length; i++){
            System.out.println(ogrenciler[i]);
        }



        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }



    }
}