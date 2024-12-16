package Ex2;

public class ElonsToyCar {
    private int distanceDrive;
    private int baterryPercentage;

    public ElonsToyCar() {
        this.distanceDrive = 0;
        this.baterryPercentage = 100;
    }
 //1. Buy a brand new remote controlled car
    public static ElonsToyCar buy() {
    return new ElonsToyCar();
}

    public String distanceDisplay() {
        return " Driven " +distanceDrive + " meters ";
    }

    public String baterryDisplay() {
        if (baterryPercentage == 0){
            return " Battery empty ";
        }
        return " Battery at " + baterryPercentage + " % ";
    }
//4,5,6.
    public void drive() {
        if (baterryPercentage > 0){
            distanceDrive += 20;
            baterryPercentage = baterryPercentage - 1; // car consume 1% battery per drive
        }
    }
}
