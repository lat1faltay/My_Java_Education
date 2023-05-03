public class Main {
    public static void main(String[] args) {

        int n1 = 48, n2 = 160, ekok;
        ekok= (n1 > n2) ? n1 : n2;
        while(true)
        {
            if( ekok % n1 == 0 && ekok % n2 == 0 )
            {
                System.out.printf("%d ve %d sayılarının EKOK'u %d dir.", n1, n2, ekok);
                break;
            }
            ++ekok;
        }
    }
}