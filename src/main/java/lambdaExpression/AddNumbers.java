package lambdaExpression;
@FunctionalInterface
public interface AddNumbers {
    public void add();


}

class MainClass {
    public static void main(String[] args) {
        AddNumbers ref = () -> {
            int a =2;
            int b = 4;
            System.out.println(a + b);
        };
    }
}
