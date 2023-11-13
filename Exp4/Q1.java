package Exp4;

public class Q1 {
    public static void main(String args[]){
        int x = 0;
        int y = 20;

        for (; y > 0; x++, y-=2){
            //y -= 2*x;
            System.out.println(String.format("x: %d", x));
            System.out.println(String.format("y: %d", y));
            System.out.println();
        }
    }
    
}
