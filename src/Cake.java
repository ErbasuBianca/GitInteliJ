public class Cake {
    public int expectedMinutesInOven() {
        return 50;
    }

    public int remainingMinutesInOven(int minuteInOven) {
        return expectedMinutesInOven() - minuteInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 5;
    }

    public int totalTimeInMinutes(int layers, int minuteInOven) {
        return preparationTimeInMinutes(layers) + minuteInOven;
    }
}
