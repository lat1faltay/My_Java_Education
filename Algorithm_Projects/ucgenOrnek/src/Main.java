import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç satır olsun: ");
        int n = scan.nextInt();


/*
     *
    ***
   *****
  *******
 *********
***********
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }



*
**
***
****
*****
******
******
*****
****
***
**
*

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int m=0; m<=n; m++){
            for(int t=0; t < (n-m); t++){
                System.out.print("*");
            }
            System.out.println();
        }



        *
      ***
    *****
  *******
*********

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2*i-1) ; k++){
                System.out.print("*");
            }
            System.out.println();

        }


       *
       **
       ***
       ****

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for(int j =0; j< i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }


*****
****
***
**
*
        for(int i=0; i < n; i++){

            for (int k = 0; k < n-i;k++){
                System.out.print("*");
            }
            System.out.println();

        }




 *****
  ****
   ***
    **
     *
        for(int i=0; i < n; i++){
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n-i;k++){
                System.out.print("*");
            }
            System.out.println();

        }



        for(int i = 0; i < n; i++){
            for(int j = 0; j<(n-i);j++){
                System.out.print(" ");
            }
            for (int k =0; k < 2 *i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=0; i <n; i++){
            for(int j = 0; j <(i); j++){
                System.out.print(" ");
            }
            for(int k = 2*n-1; k >= ((2*i) + 1); k--){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }





        for(int i=0; i <n; i++){
            for(int j = 0; j <(i); j++){
                System.out.print(" ");
            }
            for(int k = 2*n-1; k >= ((2*i) + 1); k--){
                System.out.print("*");
            }
            System.out.println();
        }





 */

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int r = 0; r <= n; r++) {
            for (int e = 1; e <= r; e++) {
                System.out.print(" ");
            }
            for (int s = (2 * n - 1); s >= 2 * r + 1; s--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}