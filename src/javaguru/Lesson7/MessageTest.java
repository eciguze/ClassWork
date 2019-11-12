package javaguru.Lesson7;

public class MessageTest {
    public static void main(String[] args) {

        System.out.println("Instances:" + Message.instancesCreated);
        new Message("Hello");
        System.out.println("Instances:" + Message.instancesCreated);
        new Message("How are you?");
        System.out.println("Instances:" + Message.instancesCreated);
        new Message("It's me!");
    }
}
