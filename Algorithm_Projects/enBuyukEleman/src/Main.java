public class Main {
    public static void main(String[] args){

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,435,3546,76,34,79,6898,35,434,32,65,13,78,34};

        int suanki=0, enBuyuk=0;

        for (int i=0; i< arr.length; i++ ){
            suanki = arr[i];
            if(suanki > enBuyuk){
                enBuyuk = suanki;
            }
        }
        System.out.println(enBuyuk);


    }
}