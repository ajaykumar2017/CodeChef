package practice;

public class ArrayOfObjects {
    public static void main(String[] args){
        Account[] obj=new Account[2];
        obj[0]=new Account();
        obj[1]=new Account();
        obj[0].setData(1,2);
        obj[1].setData(3,4);
        System.out.println("For Array element 0");
        obj[0].showData();
        System.out.println("For Array element 1");
        obj[1].showData();
    }
}
class Account{
    int a;
    int b;
    public void setData(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void showData(){
        System.out.println("Value of a="+a);
        System.out.println("Value of b="+b);
    }
}
