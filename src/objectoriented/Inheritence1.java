package objectoriented;

class SuperClass
{
    static void m(int x)
    {
        System.out.println("----SuperClass----");
        System.out.println("The value of x i="+x);
    }
}
class SubClass extends SuperClass
{
    static void m(float y)
    {
        System.out.println("----subClass----");
        System.out.println("The Value of y="+y);
    }
}
public class Inheritence1 {
    public static void main(String[] args)
    {
        SubClass.m(12);
        SubClass.m(12.34f);
    }

}
