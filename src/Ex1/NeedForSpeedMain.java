package Ex1;

public class NeedForSpeedMain {
    public static void main(String[] args) {
        // 1. Create a car
        int speed = 5;
        int batteryDrain = 2;
        NeedForSpeed car = new NeedForSpeed(speed, batteryDrain);

        // 3. Drive the car
        car.drive();
        // 4. Methods for car
        System.out.println(car.distanceDriven()); // => 5
        System.out.println(car.batteryDrained()); // => false

        // 5. Create a Nitro car
        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        nitroCar.drive();
        System.out.println(nitroCar.distanceDriven()); // => 50
        System.out.println(nitroCar.batteryDrained()); // => false

        // 2. Create a race track
        int distance = 100;
        RaceTrack raceTrack = new RaceTrack(distance);

        // 6. Check if a car can finish the race
        boolean canFinish = raceTrack.carCanFinish(car);
        System.out.println("Can car finish the race? " + canFinish); //true
    }
}

