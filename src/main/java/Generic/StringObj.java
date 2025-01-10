package Generic;

public class StringObj<T> {
    StringObj(T data) {
        System.out.println("Data: " + data);
    }
}
class Main{

    public static void main(String[] args) {
        StringObj<String> greet = new StringObj<>("Hello");

    }
}
