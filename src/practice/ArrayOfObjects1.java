package practice;

public class ArrayOfObjects1 {
    public static void main(String[] args){
        Employee[] obj=new Employee[5];
        //obj[0]=obj[1]=obj[2]=obj[3]=obj[4]=new Employee();
        obj[0]=new Employee();
        obj[1]=new Employee();
        obj[2]=new Employee();
        obj[3]=new Employee();
        obj[4]=new Employee();
        obj[0].setData("Ajay","Kolkata","1752722");
        obj[1].setData("Ashish","Kolkata","1750788");
        obj[2].setData("Aman","Chennai","1751755");
        obj[3].setData("Debsuman","Tiruvendram","1752566");
        obj[4].setData("Kundan","Mumbai","1753899");

        System.out.println("The input you have entered are:");
        for (int i=0;i<obj.length;i++){
            obj[i].showData();
        }
        int count=0;
        for (int i=0;i<obj.length;i++){
            if (obj[i].name.charAt(0)=='A'){
                count++;
            }
        }
        System.out.println("Total number of Employees whose name starts with A is: "+count+"\n" +
                "and Details are");
//        Employee[] obj1=new Employee[count];
        for (int i=0;i<obj.length;i++){
            if (obj[i].name.charAt(0)=='A'){
                System.out.println("Name:"+obj[i].name+" Location:"+obj[i].location+"  " +
                        "Employee Id:"+obj[i].empId);
            }
//            obj[i].showData();
        }
    }
}
class Employee{
    String name;
    String location;
    String empId;
    public void setData(String name, String location, String empId){
        this.name=name;
        this.location=location;
        this.empId=empId;
    }
    public void showData(){
        System.out.println("name:"+name+"  location:"+location+" empId:"+empId);
    }
}