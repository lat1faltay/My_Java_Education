public class Main {
    public static void main(String[] args) {

        // CLASS'LAR REFERANS TİPİNDEDİR

        // aşağıda CustemerManager class'ı çağırmamıza yardımcı oluyor
        // custemerManager_Example ise o class'ı bu class'ta hangi isimle kullanacağımızı gösteriyor oraya istediğimiz ismi yazabiliriz
        // aslında tam olarak değişken tanımlamak gibi diyebiliriz
        // CustemerManager tipinde custemerManager_Example isminde bir değişken tanımladık
        CustemerManager custemerManager_example = new CustemerManager();

        // Biz burada tekrardan CustemerManager tipinde custemerManager_example2 adında bir değişken oluşturduk
        // şimdi bellekte 2 alan var bunlardan biri stack diğeri ise Heap'dır
        // bizim hali hazırda tanımlı olan fonksiyonlarımız stack alanında tutuluyor
        // heap de ise new ile oluşturduğumuz şeyler tutuluyor
        // java referans tipinde bir yazılım dili olduğu için custemerManager_example ve custemerManager_example2 değişkenlerinin
        // aynı tipte olduğunu anladı
        // eğer biz bu değişkenleri birbirine eşitlersek 1 tanesinde new ile yeni bir nesne oluşturmamıza gerek kalmaz
        // ve bu değişkenlerle new ile yeni değer yarattığımız için heap alanında 2 adet farklı yerde tutuluyor olacak
        // örneğin custemerManager ve custemerManager2 değişkenleri stack alanında tutuluyor
        // custemerManager = 101 kodu ile
        // custemerManager2 = 102 kodu ile
        // tutuluyor olsun.
        // eğer biz bu ikisinin referans numarasını eşitlersek aşağıdaki gibi
        CustemerManager custemerManager_example2 = new CustemerManager();

        // son durumda elimizde böyle bir tablo olur
        // custemerManager = 101 custemerManager2
        // bu da bize heap alanından tasaruf etmemizi sağlıyor
        //şöyleki:

        //custemerManager -----> new CustemerManager()
        //custemerManager2---------/  (yukarı ok)

        // yani new ile oluşturduğumuz CustemerManager() bellekteki head alanında 2 kere tutulmayacak ve alandan tasaruf sağlamış olacağız
        // elimizden geldiği kadar new ile oluşturduğumuz nesneleri azaltmalıyız
        // çünkü new yazılımcı için pahalıdır, kullanmaktan kaçınmalıyız

        custemerManager_example = custemerManager_example2;

        custemerManager_example.Add();
        custemerManager_example.Remove();
        custemerManager_example.Update();

        System.out.println("***************************************************************************************************************");

        // Değer tipli değişkenler

        // sayi1'e 10 değerini verdik
        int sayi1 = 10;
        // sayi2'ye 20 değerini verdik
        int sayi2 = 20;
        // sayi2'nin değerini sayi1 ile eşitledik yani sayi2'nin değeri 10 oldu
        sayi2 = sayi1;
        //burada sayi1'in değerini 30'a eşitledik
        sayi1 = 30;
        // burada sayi2'nin değerini yazdırdığımızda 30 gelmesini bekliyorsak yanılıyoruz
        // nedeni bazı değişkenler referans tipinde bazı değişkenler ise value tipindedir
        System.out.println(sayi2);

        // değer tip'li değişkenler kendi içinde değerin tutulduğu alanı değil de direkt olarak değeri tutmaktadır
        // biz sayi1 değişkenini çağırdığımızda direkt kendi içindeki değeri bize verir



        // diziler referans tiptir

        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};

        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

        // Referans tipindeki değişkenleri çağırdığımızda değişken bize içinde tuttuğu değeri vermek yerine bulunduğu alanı bize verir
        // yani biz sayilar1 değişkenini çağırdığımızda sayilar1 kendi içinde değer tutmadığı için kendi içindeki referans alanına bakıyor
        // ve bellekteki o alanda tutulan değişkeni bize getiriyor
        // eğer biz sayılar1 ile sayilar2'yi birbirine eşitlersek dizilerin içindeki değişkenleri değil bellekte tutuldukları alanları eşitlemiş oluyoruz
        // bu olayda bize bellekte tek noktada tutulan veriyi birden fazla değişkende kullanabilmemize olanak sağlıyor
        //

        // aslında referans tipte olanlarda kısacası şöyle diyebiliriz:
        // bellekte 1 nesne 2 değişken tarafından tutuluyor

        // ayrıca kendi düşünceme göre de 2 değişkeni birbirine eşitlediğimizde hangisinin değeri değişiyorsa (örneğin yukarıda sayilar2'nin değeri değişiyor)
        // o değişkenin tanımlandığı yerde new ile başlayan kısımın rengi soluyorsa anlıyoruz ki
        //o değişken referans tipindedir


    }
}
