import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1.Sign in\n2.Log in \n3.exit");
            System.out.print("Enter choice:");
            int choice =sc.nextInt();
             sc.nextLine();
            System.out.print("Enter the name:");
            String name=sc.nextLine();
            System.out.print("Enter the password:");
            String pass=sc.nextLine();
            switch(choice){
                case 1:
                    login(name,pass);
                    break;
                case 2:
                    verify(name,pass);

                    break;
                case 3:
                    return;
            }
        }

    }

    private static void verify(String name, String pass) throws SQLException {
        String query = "SELECT password FROM user_credential WHERE username = ?";
        Connection con = DataBaseConnection.getConnection();
        PreparedStatement pstmt = con.prepareStatement(query);


        pstmt.setString(1, name);


        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {  // username found
            String dbPass = rs.getString("password"); // fetch password from DB
            if (dbPass.equals(pass)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Invalid Password!");
            }
        } else {
            System.out.println("Username not found!");
        }



        pstmt.close();
        con.close();
    }


    private static void login(String name,String pass) throws SQLException {

        String query="insert into user_credential (username,password) values(?,?)";
        Connection con=DataBaseConnection.getConnection();
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1,name);
        pstmt.setString(2,pass);
        int rows = pstmt.executeUpdate();
        if (rows > 0) {
            System.out.println("Sign-in successfully!");
        }

    }
}