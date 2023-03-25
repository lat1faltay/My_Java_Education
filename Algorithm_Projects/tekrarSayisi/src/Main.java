import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{11,12,13,41,52,11,74,11,11};

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int x = scan.nextInt();


        int c = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                c = c + 1;

            }
        }
        System.out.println(x +" sayısı dizide " + c + " kere yazılmıştır ");

    }
}