interface BaseI { void method(); }

class BaseC {
    public void method() {
        System.out.println("BaseC.method()");
    }
}

class ImplC extends BaseC implements BaseI {
    public static void main(String[] s) {
        (newImplC()).method();
    }
}
