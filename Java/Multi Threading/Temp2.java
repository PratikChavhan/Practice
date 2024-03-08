class Base {
    public void fun3() {
        System.out.println("Base fun3()");
    }

    public void fun1() {
        System.out.println("Base fun1()");
        fun3();
    }
}

class derived extends Base {
    public void fun() {
        System.out.println("Derived fun()");
    }
}

public class Temp2 {
    public static void main(String[] args) {
        Base base = new derived();
        derived d1 = (derived) base;
        // derived d1 = new Base();
        d1.fun1();
    }
}
