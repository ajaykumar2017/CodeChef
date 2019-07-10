package jdbc;
import java.sql.*;
public class CreateStatement {
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
            System.out.println("connection established");
            Statement st=cn.createStatement();
            System.out.println("Statement created");
            st.close();
            cn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.toString());
        }
    }
}
