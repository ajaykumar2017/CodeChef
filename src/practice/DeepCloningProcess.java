package practice;

class Address2 implements Cloneable {
    String hNo = "12-34/h";
    String sName = "sr Nagar";
    String city = "hyd";

    void disAdd() {
        System.out.println("Hno:" + hNo + "\nsName:" + sName + "\ncity:" + city);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
class Student2 implements Cloneable{
    String name="nit.v";
    String rNo="A1213";
    String br="CSE";
    Address2 add=new Address2();
    void getData(){
        System.out.println("name="+name+"\nrNo:"+rNo+"\nbr:"+br);
    }
    public Object clone() throws CloneNotSupportedException{
        Student2 s=(Student2)super.clone();
        s.add=(Address2)this.add.clone();
        return s;
    }
}

public class DeepCloningProcess {
    public static void main(String[] args) throws  CloneNotSupportedException{
        //original object
        Student2 obj1=new Student2();
        System.out.println("---Dis original object---");
        System.out.println("hashcode of obj1="+obj1.hashCode());
        System.out.println("hashcode of obj1.add="+obj1.add.hashCode());
        //Cloning object
        Student2 obj2=(Student2)obj1.clone();
        System.out.println("---Dis cloned object---");
        System.out.println("hashcode of obj2="+obj2.hashCode());
        System.out.println("hashcode of obj2.add="+obj2.add.hashCode());
        System.out.println("---Process---");
        if (obj1.add==obj2.add){
            System.out.println("Shallow cloning process");
        }else{
            System.out.println("Deep cloning process");
        }


    }
}
