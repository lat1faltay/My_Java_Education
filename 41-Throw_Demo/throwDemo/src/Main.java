public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap bakiyesi: "+manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap bakiyesi: "+manager.getBalance());

        try{
            manager.withdraw(90);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap bakiyesi: "+manager.getBalance());
        System.out.println("Birinci ");

        try{
            manager.withdraw(900);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap: " + manager.getBalance());
        System.out.println("ikinci");

        try{
            manager.withdraw(200);
        }catch (BalanceInsufficentException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap: " + manager.getBalance());
        
    }
}