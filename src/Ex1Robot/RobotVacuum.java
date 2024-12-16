package Ex1Robot;

public class RobotVacuum {

    // Task 1: Define the total battery life in minutes
    public int totalBatteryLife() {
        return 120;
    }

    // Task 1: Calculate the remaining battery life
    public int remainingBatteryLife(int minuteInOven) {
        return totalBatteryLife() - minuteInOven;
    }

    //Task 3: Calculate the cleaning time per room
    public int cleaningTimePerRoom(int squareMeters) {
        return squareMeters / 2;
    }

    // Task 4: Calculate the total cleaning time for a house
    public int totalCleaningTime(int[] roomSizes) {
        int totalTime = 0;
        for (int roomSize : roomSizes) {
            totalTime += cleaningTimePerRoom(roomSize); // Sum up cleaning time for each room
        }
        return totalTime;
    }

    // Task 5:Calculate if the vacuum can finish cleaning without recharging
    public boolean canFinishCleaning(int[] roomSizes, int minutesUsed) {
        int remainingBatteryLife = remainingBatteryLife(minutesUsed);
        int requiredTime = totalCleaningTime(roomSizes);
        return remainingBatteryLife >= requiredTime;


    }
}


   
