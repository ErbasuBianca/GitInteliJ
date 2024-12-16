package Lasagna;

public class Lasagna {
    // Task 1: Define the expected oven time in minutes
    public int expectedMinuteInOven() {
        return 40; // Expected minuted in oven
    }

    // Task 2: Calculate the remaining oven time in minutes
    public int remainingMinutesInOven(int minuteInOven) {
        return expectedMinuteInOven() - minuteInOven;
    }
    // Task 3: Calculate the preparation time in minutes
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layer, int minuteInOven) {
        return preparationTimeInMinutes(layer) + minuteInOven;
    }
}
