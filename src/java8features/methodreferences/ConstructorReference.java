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