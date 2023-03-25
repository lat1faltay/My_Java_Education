public class Main {
    public static void main(String[] args) {

        // Product class'ında yapıcı metot kullanılmıştır
        // yapıcı metotlara değer atama işlemi bu şekilde yapılmaktadır
        Product product = new Product(1,"Laptop","MSI LAPTOP", 5000, 3,"siyah","1");

        //Product product = new Product();
        /*
        product.setName("Laptop");
        product.id = 1;
        product.setDescription("MSI Laptop");
        product.setPrice(5000);
        product.setStcokAmount(3);
        */

        /*
        aşağıdaki kod bloğu setter metotu ile Product class'ındaki field'lara yani özelliklere değer atamak için yazılmıştır
        Yukarıdaki kod bloğu da Product class'ındaki field'lara yani özelliklere değer atamak için yazılmıştır
        Fakat yukarıdaki kullanımda field'lar public olduğundan dolayı setter metotuna ihtiyaç duyulmadan değer atayabiliyoruz
        ancak field'lar private olursa setter metotu kullanmak zorundayız
        Fakat private field'lara değer ataması yapmak için illaki setter metotunu kullanmamıza gerek yok
        Bu kod bloğunu yorum satırı haline getirmemizin sebebi olan yapıcı metotlar ile de aynı işlemi gerçekleştirebiliriz
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("MSI Laptop");
        product.setPrice(5000);
        product.setStcokAmount(3);
        */

        ProductManager productManager = new ProductManager();
        productManager.add(product);

        // aşağıdaki kod getter metotunun çıktısını görmek için yazıldı
        System.out.println(product.getKod());


    }
}