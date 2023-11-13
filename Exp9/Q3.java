package Exp9;

import Exp9.Advcalculate.addCalc;
import Exp9.Advcalculate.mulCalc;

public class Q3 {
    public static void main(String[] args) {
        addCalc add = new addCalc();
        mulCalc mul = new mulCalc();
        System.out.println("Addition: " + add.add(5, 6));
        System.out.println("Multiplication: " + mul.mul(5, 6));
    }
}

