import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,67,8,8,9,9,34,0,45,765,6,53,63,46};

        Scanner scan = new Scanner(System.in);
        System.out.print("sayı girin: ");
        int input = scan.nextInt();
        int total = 0;

        for(int i = 0; i < arr.length; i++){
            if(input > arr[i]){
                total = total + 1;
            }
        }

        System.out.println(input + " sayısından küçük " + total +" tane eleman vardır");


    }
}