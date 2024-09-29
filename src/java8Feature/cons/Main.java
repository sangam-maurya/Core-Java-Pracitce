package java8Feature.cons;

public class Main {
    public static void main(String[] args) {

        Provider provider = Student::new;

        Student getmsg = provider.getmsg();
        getmsg.name();

    }
}
