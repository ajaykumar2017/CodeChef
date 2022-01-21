package java8features.lambdaexpression;

interface Sayable1 {
    String say(String name);
}

public class LambdaExpression4 {
    public static void main(String[] args) {

        // Lambda expression with single parameter.
        Sayable1 s = (name) -> "Hello, " + name;
        System.out.println(s.say("Ajay"));

        // You can also omit functional parenthesis
        Sayable1 s1 = name -> "Hello, " + name;
        System.out.println(s1.say("Aman"));

        // You can pass multiple statements in lambda expression
        Sayable1 person = (name)-> {
            String str1 = "I would like to say, ";
            String str2 = str1 + name;
            return str2;
        };
        System.out.println(person.say("time is precious."));
    }
}
