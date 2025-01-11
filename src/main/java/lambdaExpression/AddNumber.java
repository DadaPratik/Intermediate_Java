package lambdaExpression;



@FunctionalInterface

public interface AddNumber {
    void add();
}

class Main {
    public static void main(String[] args) {
        AddNumber ref = ()-> System.out.println(5+9);
        ref.add();
    }
}
