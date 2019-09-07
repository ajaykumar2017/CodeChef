package practice;

/*
 *In shallow cloning process the objects which are referred by their reference will not
 * be cloned
 */
class Address1 {
    String hNo = "12-34/h";
    String name = "SR Nagar";
    String city = "Hyd";

    void disAdd() {
        System.out.println("H No:" + hNo + "\nName" + name + "\nCity" + city);
    }
}

class Student1 implements Cloneable {
    String name = "Nit.v";
    String rNo = "A1234";
    String br = "CSE";
    Address1 add = new Address1();

    void getData() {
        System.out.println("name:" + name + "\nrNo:" + rNo + "\nbr:" + br);
    }

    public Object clone() throws CloneNotSupportedException {
        return (super.clone());
    }

}

public class ShallowCloningProcess {
    public static void main(String[] args) throws CloneNotSupportedException {
        //original object
        Student1 obj1=new Student1();
        System.out.println("------Data is original object-----");
        obj1.getData();
        obj1.add.disAdd();
        System.out.println("hashcode of obj1="+obj1.hashCode());
        //Cloned object
        Student1 obj2=(Student1)obj1.clone();
        System.out.println("------Dis cloned object-----");
        obj2.getData();
        obj2.add.disAdd();
        System.out.println("hashcode of obj2="+obj2.hashCode());
        System.out.println("----Process----");
        if (obj1.add==obj2.add)
        {
            System.out.println("Shallow cloning process");
        }
        else{
            System.out.println("Deep cloning process");
        }
    }
}
