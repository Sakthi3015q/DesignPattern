import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseConnection {
    static String url = "jdbc:postgresql://localhost:5432/naren";
    static String username = "postgres";
    static String password = "sakthi515";

    static Connection con;


    private DataBaseConnection() throws SQLException {
    }
    public static Connection  getConnection() throws SQLException {
         con=DriverManager.getConnection(url,username,password);
         return  con;
    }


}
