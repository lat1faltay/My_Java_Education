public class Product {

    // constructor yani yapıcı metot
    // bu metot default olarak aşağıdaki şekilde (içerisi boş olan) gelir
    // eğer biz getter ile setter fonksiyonlarını kullanmadan direkt olarak çalışmak istiyorsak yapıcı metotu kullanabiliriz
    public Product(int id, String name, String description, double price, int stcokAmount, String renk, String kod) {
        System.out.println("Yapıcı metot çalıştı");

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stcokAmount = stcokAmount;
        this.renk = renk;
        this.kod = kod;

    }

    // Product class'ı çalıştığı anda default olarak çalışan bir metot'tur
    // biz bunu görmesek dahi bu kod bloğu varsayılan olarak gelir
    // eğer bu class'ı kullanacaksak ve aşağıdaki default gelen metot'u boş bırakacaksak (default hali boş geliyor ve biz görmüyoruz ekranda yazmıyor)
    // getter ve setter metotları ile çalışmamız gerekmektedir
    public Product() {

    }

    // attribute | Field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stcokAmount;
    private String renk;
    private String kod;


    // Getter
    public int getId() {
        return id;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStcokAmount() {
        return stcokAmount;
    }

    public void setStcokAmount(int stcokAmount) {
        this.stcokAmount = stcokAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }


}
