package jdbc;
import java.sql.*;
public class JDBC_Connection4 {
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver is registered with driver manager");
//            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
            Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@orcl","scott","tiger");
            System.out.println("Established connection to a database");
            System.out.println(cn);
            cn.close();
            Driver d=DriverManager.getDriver("jdbc:oracle:thin:@orcl");
            DriverManager.deregisterDriver(d);
            System.out.println("Driver is removed from Driver Manager");
        }catch(ClassNotFoundException e){
            System.out.println("Invalid driver class name");
        } catch (SQLException e1) {
//            System.out.println(e1);
            e1.printStackTrace();
        }
    }
}
