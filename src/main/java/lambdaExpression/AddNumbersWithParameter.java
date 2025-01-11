package lambdaExpression;
@FunctionalInterface
public interface AddNumbersWithParameter {
    public void add(int a, int b);
}


class Main1 {
    public static void main(String[] args) {
        AddNumbersWithParameter ref = (int x, int y)->{
            System.out.println(x + y);
        };
        ref.add(1, 2);
        ref.add(2, 3);
    }

}