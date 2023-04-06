import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName = "root";
    private String password = "Deneme01!";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";

    public Connection getConncetion() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }


    public void showErrorMessage(SQLException exception){
        System.out.println("Error : " + exception);
        System.out.println("Error code: " + exception.getErrorCode());
    }

}
