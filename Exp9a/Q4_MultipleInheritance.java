package Exp9a;

interface I1{
    public void methodI1();
}

interface I2{
    public void methodI2();
}

public class Q4_MultipleInheritance implements I1, I2{
    public void methodI1() {
        System.out.println("Method from I1");
    }

    public void methodI2() {
        System.out.println("Method from I2");
    }

    public static void main(String[] args) {
        Q4_MultipleInheritance myObj = new Q4_MultipleInheritance();
        myObj.methodI1();
        myObj.methodI2();
    }
}
