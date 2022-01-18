package java8features;

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
