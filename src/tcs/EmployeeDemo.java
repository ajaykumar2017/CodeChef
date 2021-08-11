package tcs;

import java.util.*;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n=sc.nextInt();
        sc.nextLine();
        String[] employeeDetails=new String[n];
        //taking input
        for (int i=0;i<n;i++){
            employeeDetails[i]=sc.nextLine();
        }
        Employee[] emp=getEmployeeDetails(employeeDetails);
        //showing output
        for(int i=0;i<emp.length;i++){
            //To find the employees whose name starts with 'A'
            if (emp[i].getEmployeeName().charAt(0)=='A'){
                System.out.println("Employee Id: "+emp[i].getEmployeeId()+
                        " Employee Name:"+emp[i].getEmployeeName()+
                        " Gender: "+emp[i].getGender()+" Age: "+emp[i].getAge());
            }
        }

    }

    public static Employee[] getEmployeeDetails(String[] details){
        Employee[] emp=new Employee[details.length];
        for(int i=0;i<details.length;i++){
            String[] temp=details[i].split("-");
            emp[i]=new Employee(temp[0],temp[1],temp[2],Integer.parseInt(temp[3]));
        }
        return emp;
    }
}
