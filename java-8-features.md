# Java 8 Programming Language Enhancements
#### Java 8 provides following features for Java Programming:

- Lambda expressions,
- Method references,
- Functional interfaces,
- Stream API,
- Default methods,
- Base64 Encode Decode,
- Static methods in interface,
- Optional class,
- Collectors class,
- ForEach() method,
- Nashorn JavaScript Engine,
- Parallel Array Sorting,
- Type and Repating Annotations,
- IO Enhancements,
- Concurrency Enhancements,
- JDBC Enhancements etc.

# 1. Lambda expressions
Lambda expression is a new and important feature of Java which was included in Java SE 8. It provides a clear and concise way to represent one method interface using an expression. It is very useful in collection library. It helps to iterate, filter and extract data from collection.

The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

Java lambda expression is treated as a function, so compiler does not create .class file.

#### Syntax
- The simplest lambda expression contains a single parameter and an expression:
> parameter -> expression
- To use more than one parameter, wrap them in parentheses:
> (parameter1, parameter2) -> expression
#### Java Lambda Expression Example: Foreach Loop
```java
public class LambdaExpression1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(7);
        arrayList.add(11);
        arrayList.add(9);
        /**
         * Use a lamba expression in the ArrayList's forEach() method to print every item in the list
         */
        arrayList.forEach( (n) -> System.out.println(n));
    }
}
```
#### Java Lambda Expression Example
```java
interface Drawable {
    void draw();
}
public class LambdaExpression2 {
    public static void main(String[] args) {
        int width = 10;
        // Using Without Lambda Expression
        /*Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing "+width);
            }
        };*/

        Drawable d = () -> System.out.println("Drawing "+width);
        d.draw();
    }
}
```
#### Java Lambda Expression Example: No Parameter
```java
package java8features;

interface Sayable {
    String say();
}

public class LambdaExpression3 {
    public static void main(String[] args) {
        Sayable s = () -> "I have to say nothing";

        System.out.println(s.say());
    }
}

```
#### Java Lambda Expression Example: Single Parameter and Multiple Statements
```java
package java8features;

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

```
#### Java Lambda Expression Example: Multiple Parameters and with or without return keyword
```java
package java8features;

interface Addable {
    int add(int p1, int p2);
}

public class LambdaExpression5 {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
        Addable add1 = (p1, p2) -> (p1 + p1);
        System.out.println(add1.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addable add2 = (int p1, int p2) -> {
            return (p1 + p2);
        };
        System.out.println(add2.add(20, 30));

        // Lambda expression with return keyword.
        Addable add3 = (int p1, int p2) -> (p1 + p2);
        System.out.println(add3.add(20, 30));

    }
}

```
#### Java Lambda Expression Example: Creating Thread
```java
package java8features;

public class LambdaExpression6 {
    public static void main(String[] args) {

        //Thread Example without lambda
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Thread1 is running...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        //Thread Example with lambda
        Runnable r2 = () -> {
            System.out.println("Thread2 is running...");
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
```
#### Java Lambda Expression Example: Comparator
```java
package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaExpression7 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1, "HP Laptop", 25000f));
        list.add(new Product(3, "Keyboard", 300f));
        list.add(new Product(2, "Dell Mouse", 150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p : list) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }

    }
}
```
#### Java Lambda Expression Example: Filter Collection Data
```java
package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product1 {
    int id;
    String name;
    float price;

    public Product1(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaExpression8 {
    public static void main(String[] args) {
        List<Product1> list = new ArrayList<>();
        list.add(new Product1(1, "Samsung A5", 17000f));
        list.add(new Product1(3, "Iphone 6S", 65000f));
        list.add(new Product1(2, "Sony Xperia", 25000f));
        list.add(new Product1(4, "Nokia Lumia", 15000f));
        list.add(new Product1(5, "Redmi4 ", 26000f));
        list.add(new Product1(6, "Lenevo Vibe", 19000f));

        // using lambda to filter data
        Stream<Product1> filtered_data = list.stream().filter(p -> p.price > 20000);

        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.name + ": " + product.price)
        );
    }
}
```
#### Java Lambda Expression Example: Event Listener
```java
package java8features;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaExpression9 {
    public static void main(String[] args) {
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("click");
        b.setBounds(80, 100, 70, 30);

        // lambda expression implementing here.
        b.addActionListener(e -> {
            tf.setText("hello swing");
        });

        JFrame f = new JFrame();
        f.add(tf);
        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(300, 200);
        f.setVisible(true);

    }

}
```

# 2. Java Method References
>Java provides a new feature called method reference in Java 8. Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference. In this tutorial, we are explaining method reference concept in detail.

#### Types of Method References
There are following types of method references in java:

1. Reference to a static method.
2. Reference to an instance method.
3. Reference to a constructor.
![types-of-method-references](https://static.javatpoint.com/java/new/images/types-of-method-references.jpg)
#### 1. Reference to a static method
> You can refer to static method defined in the class. Following is the syntax and example which describe the process of referring static method in Java.
```java
package java8features.methodreferences;
/**
 * Example 1
 * In the following example, we have defined a functional interface and referring
 * a static method to it's functional method say().
 */
interface Sayable {
    void say();
}

public class MethodReference1 {

    public static void saySomething() {
        System.out.println("Hello This is a static method");
    }

    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = MethodReference1::saySomething;
        // Calling interface method
        sayable.say();
    }
}
```
```java
package java8features.methodreferences;
/**
 * Example 2
 * In the following example,
 * we are using predefined functional interface Runnable to refer static method.
 */
public class MethodReference2 {
    public static void threadStatus() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread t2 = new Thread(MethodReference2::threadStatus);
        t2.start();
    }
}
```
```java
package java8features.methodreferences;
import java.util.function.BiFunction;
/**
 * Example 3
 * You can also use predefined functional interface to refer methods. In the following example,
 * we are using BiFunction interface and using it's apply() method.
 */
class Arithmetic {
    public static int add (int a, int b) {
        return a + b;
    }
}
public class MethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}
```
```java
package java8features.methodreferences;
import java.util.function.BiFunction;
/**
 * Example 4
 * You can also override static methods by referring methods.
 * In the following example, we have defined and overloaded three add methods.
 */
class Arithmetic1 {
    public static int add(int a, int b) {
        return a + b;
    }
    public static float add(int a, float b) {
        return a + b;
    }
    public static float add(float a, float b) {
        return a + b;
    }
}

public class MethodReference4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder1 = Arithmetic1::add;
        BiFunction<Integer, Float, Float> adder2 = Arithmetic1::add;
        BiFunction<Float, Float, Float> adder3 = Arithmetic1::add;

        int result1 = adder1.apply(10, 20);
        float result2 = adder2.apply(10, 20.6f);
        float result3 = adder3.apply(13.6f, 14.6f);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
```
#### 2. Reference to an Instance Method
> like static methods, you can refer instance methods also. In the following example, we are describing the process of referring the instance method.

Syntax
```
containingObject::instanceMethodName
```
```java
package java8features.methodreferences;
/** Example 1
 * In the following example, we are referring non-static methods.
 * You can refer methods by class object and anonymous object.
 */
interface Sayable2 {
    void say();
}
public class InstanceMethodReference {
    public void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }
    public static void main(String[] args) {
        InstanceMethodReference methodReference = new InstanceMethodReference();
        // Referring non-static method using reference
        Sayable2 sayable = methodReference::saySomething;
        // Calling interface method
        sayable.say();

        // Referring non-static method using anonymous object
        Sayable2 sayable2 = new InstanceMethodReference()::saySomething;
        // Calling interface method
        sayable2.say();
    }
}
```
```java
package java8features.methodreferences;
/**
 * In the following example, we are referring instance (non-static) method.
 * Runnable interface contains only one abstract method.
 * So, we can use it as functional interface
 */
public class InstanceMethodReference2 {
    public void printMsg() {
        System.out.println("This is a message!");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new InstanceMethodReference2()::printMsg);
        thread.start();
    }
}
```
```java
package java8features.methodreferences;
import java.util.function.BiFunction;
/**
 * In the following example, we are using BiFunction interface.
 * It is a predefined interface and contains a functional method apply().
 * Here, we are referring add method to apply method.
 */
class Arithmetic2 {
    public int add (int p1, int p2) {
        return p1 + p2;
    }
}
public class InstanceMethodReference3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = new Arithmetic2()::add;
        int result = adder.apply(10, 30);
        System.out.println(result);
    }
}
```
#### 3. Reference to a Constructor
> You can refer a constructor by using the new keyword. Here, we are referring constructor with the help of functional interface.

Syntax
```
ClassName::new
```
Example
```java
package java8features.methodreferences;
interface MessageAble {
    Message getMessage(String msg);
}
class Message {
    Message(String msg) {
        System.out.println(msg);
    }
}
public class ConstructorReference {
    public static void main(String[] args) {
        MessageAble messageAble = Message::new;
        messageAble.getMessage("Hello There!");
    }
}
```
 
