import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        DbHelper helper = new DbHelper();

        try{
           connection = helper.getConncetion();
            System.out.println("Bağlantı başarılı");
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }finally {
            connection.close();
            System.out.println("Bağlantı bitti");
        }

    }
}