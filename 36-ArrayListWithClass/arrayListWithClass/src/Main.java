import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer latif = new Customer(1,"Latif","Altay");
        //customers.add(new Customer(1,"Latif","Altay"));
        customers.add(latif);
        customers.add(new Customer(2,"Simge","Sağın"));
        customers.add(new Customer(3,"İrem","Derici"));

        //customers.remove(new Customer(1,"Latif","Altay"));
        customers.remove(latif);
        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }

    }
}