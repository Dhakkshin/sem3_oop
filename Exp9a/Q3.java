package Exp9a;

// Interface I1
interface I1 {
    void methodI1();
}

// Interface I2 extending I1
interface I2 extends I1 {
    void methodI2();
}

// Class implementing both I1 and I2
class Example implements I2 {
    public void methodI1() {
        System.out.println("Method from I1");
    }

    public void methodI2() {
        System.out.println("Method from I2");
    }
}

public class Q3 {
    public static void main(String[] args) {

        Example example = new Example();

        example.methodI1();
        example.methodI2();
    }
}
