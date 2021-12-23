import java.util.Scanner;

interface Foo {
    int x = 10;
}

public class Solution {

    public static void main(String[] args) {
        Foo.x = 20;
        System.out.println(Foo.x);
    }
}
