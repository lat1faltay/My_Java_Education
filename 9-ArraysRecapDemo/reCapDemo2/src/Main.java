public class Main {
    public static void main(String[] args) {

        // dizileri ya aşağıdaki gibi tanımlıyoruz
        // double[] myList = new double[4];

        // ya da böyle tanımlıyoruz ikisinin arasında fark yok
        double[] myList = {1.2, 1.3, 4.3, 5.6};

        //dizi elemanlarını hem böyle
//        for (int i =0; i < myList.length; i++){
//            System.out.println(myList[i]);
//        }

        double total=0;
        double max=myList[0];

        // Hem de böyle yazdırabiliriz, böyle yazdırmamız daha doğru
        for (double number:myList){
            if (max<number){
                max = number;
            }
            total= total+number;
            System.out.println(number);
        }
        System.out.println("Dizideki elemanların toplamı: " + total);
        System.out.println("En büyük sayı: " + max);


    }
}