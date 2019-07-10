package jdbc;
import java.util.*;
import java.sql.*;
public class RegisterDriverManagerByDefiningDriverClass2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Input driver Class Name");
        String name=scan.next();
        try{
            Class c=Class.forName(name);
            Driver d=(Driver)c.newInstance();
            DriverManager.registerDriver(d);
            System.out.println("driver is registered with Driver Manager");
        }catch(ClassNotFoundException e){
            System.out.println("Invalid driver class Name");
        } catch (IllegalAccessException e1) {
            System.out.println("Error in creating driver object");
        } catch (InstantiationException e2) {
            System.out.println("Error in creating driver object2");
        } catch (SQLException e3) {
            System.out.println("SQL Error");
        }
    }
}
