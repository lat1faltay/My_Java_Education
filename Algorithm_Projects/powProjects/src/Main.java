public class Main {
    public static void main(String[] args) {

        int birler, onlar, yuzler, binler;

        for (int i = 1000; i < 10000; i++) {
            birler = i % 10;
            onlar = i / 10 % 10;
            yuzler = i / 100 % 10;
            binler = i / 1000 % 10;

            if (i == Math.pow(birler,birler) + Math.pow(onlar, onlar) + Math.pow(yuzler,yuzler) + Math.pow(binler,binler) ) {
                System.out.println(i);
            }
        }


    }
}