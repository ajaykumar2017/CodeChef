package jdbc;
import java.sql.*;

import oracle.jdbc.OracleDriver;
public class RegisterDriverJdbc1 {
    public static void main(String[] args){
        try{
            OracleDriver d=new OracleDriver();
            DriverManager.registerDriver(d);
            System.out.println("Driver is registered with Driver Manager");
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
}
