package jdbc;

public class LoadDriverClass3 {
    public static void main(String[] args){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver registered with Driver Manager");
        }catch(ClassNotFoundException e)
        {
            System.out.println("Invalid driver class name");
        }
    }
}
