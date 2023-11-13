package Exp9a;

interface CNG_Car{
    public void cng_kit();
    public void drive();
}

interface Petrol_Car{
    public void petrol_kit();
    public void drive();
}

public class Q5_hybridCar {

    public void cng_kit(){
        System.out.println("CNG Kit Installed");
    }

    public void petrol_kit(){
        System.out.println("Petrol Kit Installed");
    }

    public void drive(){
        System.out.println("Driving");
    }

    public static void main(String[] args) {
        Q5_hybridCar h = new Q5_hybridCar();
        h.cng_kit();
        h.petrol_kit();
        h.drive();
    }

}
