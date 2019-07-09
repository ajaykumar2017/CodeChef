package practice;

public class StringBufferClass {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer();
        System.out.println("Default Capacity="+sb.capacity());
        System.out.println("length="+sb.length());
        sb.append("java");
        sb.append("program");
        System.out.println("Capacity="+sb.capacity());
        System.out.println("length="+sb.length());
        System.out.println("sb="+sb);
        System.out.println("Capacity="+sb.capacity());
        System.out.println("length="+sb.length());
        System.out.println("reverse="+sb.reverse());
        sb.trimToSize();
        System.out.println("---After trim process---");
        System.out.println("Capacity="+sb.capacity());
        System.out.println("length="+sb.length());


    }
}
