package tcs;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String gender;
    private int age;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String employeeId, String employeeName, String gender, int age){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.gender=gender;
        this.age=age;
    }
}
