package jdbc;
import java.sql.*;
import java.util.*;
public class DriverInformation5 {
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Enumeration<Driver> e=DriverManager.getDrivers();
            while (e.hasMoreElements()){
                Driver d=e.nextElement();
                System.out.println(d);
            }
        }catch(ClassNotFoundException e){
            System.out.println("Invalid driver class name");
        }
    }
}
