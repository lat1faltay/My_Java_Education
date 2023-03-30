import java.util.ArrayList;

public class Main {
    public static <Objects> void main(String[] args) {

        ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("İstanbul");

        //System.out.println(sayilar.size());
        //System.out.println(sayilar.get(2));
        //System.out.println(sayilar.set(0,34));

        //sayilar.remove(0);
        //sayilar.clear();
        //System.out.println(sayilar.get(0));

        for (Object i:sayilar){
            System.out.println(i);
        }



    }
}