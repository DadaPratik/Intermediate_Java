package Generic;

public class MyClass<T> {
    public MyClass(T data) {
        System.out.println("Data is: " + data);

    }
}
class MainClass {
    public static void main(String[] args) {
        MyClass<Integer> intObj = new MyClass<Integer>(1);
    }
}