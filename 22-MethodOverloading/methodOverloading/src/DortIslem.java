public class DortIslem {
    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    // iki field'da da aynı ismi vermemize rağmen problem olmadan kullanabiliyoruz
    // bu olaya overloading yani aşırı yükleme deniyor

    public int topla(int sayi3, int sayi4, int sayi5) {
        return sayi3 + sayi4 + sayi5;
    }

}
