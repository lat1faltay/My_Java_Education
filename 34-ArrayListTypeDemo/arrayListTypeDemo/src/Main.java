import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("İstanbul");
        sehirler.add("Sakarya");
        sehirler.add("Aydın");
        sehirler.add("Bolu");
        sehirler.add("Eskişehir");
        sehirler.remove("Sakarya");


        Collections.sort(sehirler);

        for(String a:sehirler){
            System.out.println(a);
        }

    }
}