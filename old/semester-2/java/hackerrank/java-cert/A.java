public class A {
    int add(int i, int j) {
        return i + j;
    }
}

public class B extends A {
    public static void main(String[] argv) {
        short s = 9;
        System.out.println(add(s, 6));
    }
}
