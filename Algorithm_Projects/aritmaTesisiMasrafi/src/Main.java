import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




       int gunlukAritilanSu = 5000;
       int totalAritilanSu = 0;
       double fiyat = 0;
       double toplam = 0;

       for(int i = 0; i <= 365; i++){
           totalAritilanSu += gunlukAritilanSu;

           if(totalAritilanSu<=30000){
               fiyat = gunlukAritilanSu * 2.5;
           } else if (totalAritilanSu>30000 && totalAritilanSu<=50000) {
               fiyat = gunlukAritilanSu * 3;
           } else if (totalAritilanSu>50000) {
               fiyat = gunlukAritilanSu * 3.5;
           }

           toplam = toplam + fiyat;
           System.out.println(i+". Gün Sonunda Masraf = "+toplam+" TL");


       }





    }
}