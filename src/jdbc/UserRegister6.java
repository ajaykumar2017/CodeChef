package jdbc;
import java.sql.*;
public class UserRegister6 {
    public static void main(String[] args){
        Connection cn=null;
        Statement st=null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
            st=cn.createStatement();
            int count=st.executeUpdate("insert into test values(3,'aman','12345')");
            System.out.println(count);
        } catch (ClassNotFoundException | SQLException e1) {
            e1.printStackTrace();
        } finally {
            try{
                if (st!=null)
                    st.close();
                if (cn!=null)
                    cn.close();
            }catch(SQLException e3){
                e3.printStackTrace();
            }
        }
    }
}
