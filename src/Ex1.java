import Ex1Robot.RobotVacuum;

/*
### Exercise: Manage a Robotic Vacuum Cleaner

You are designing software for a robotic vacuum cleaner. Your task is to write
methods to calculate various operational times for the vacuum as it cleans a house.
The vacuum has a limited battery life and requires charging after a certain period.
---

#### Task 1: Define the total battery life in minutes

Write a method `totalBatteryLife()` that returns the total number of minutes the
robotic vacuum can run on a full charge. The total battery life is **120 minutes**.

Example:

```java

RobotVacuum vacuum = new RobotVacuum();

vacuum.totalBatteryLife();

// => 120

```

---

#### Task 2: Calculate the remaining battery life

Write a method `remainingBatteryLife(int minutesUsed)` that takes the number of
 minutes the vacuum has been operating and calculates the remaining battery life.

Example:

```java

RobotVacuum vacuum = new RobotVacuum();

vacuum.remainingBatteryLife(45);

// => 75

```

---
#### Task 3: Calculate the cleaning time per room
Write a method `cleaningTimePerRoom(int squareMeters)` that takes the size of
a room in square meters as a parameter and calculates the time required to clean it.
The vacuum cleans at a rate of **2 square meters per minute**.

Example:

```java

RobotVacuum vacuum = new RobotVacuum();

vacuum.cleaningTimePerRoom(30);

// => 15

```
---

#### Task 4: Calculate the total cleaning time for a house
Write a method `totalCleaningTime(int[] roomSizes)` that takes an array of
room sizes in square meters (one size for each room) and calculates the total cleaning time for all rooms.
Assume all rooms are cleaned one after another.

Example:

```java

RobotVacuum vacuum = new RobotVacuum();

int[] rooms = {30, 40, 20};

vacuum.totalCleaningTime(rooms);

// => 45

```
---

#### Task 5: Calculate if the vacuum can finish cleaning without recharging

Write a method `canFinishCleaning(int[] roomSizes, int minutesUsed)` that takes two parameters:

1. An array of room sizes in square meters.

2. The number of minutes the vacuum has already been used.

The method should calculate if the vacuum has enough remaining battery life to clean all rooms in the `roomSizes` array without recharging. It should return `true` if it can finish cleaning, and `false` otherwise.

Example:

```java

RobotVacuum vacuum = new RobotVacuum();

int[] rooms = {30, 40, 50};

vacuum.canFinishCleaning(rooms, 50);

// => false

```
---

### Expected Output

Here’s how the program should behave:

```java

public class Main {

public static void main(String[] args) {

RobotVacuum vacuum = new RobotVacuum();

System.out.println(vacuum.totalBatteryLife()); // => 120

System.out.println(vacuum.remainingBatteryLife(45)); // => 75

System.out.println(vacuum.cleaningTimePerRoom(30)); // => 15

int[] rooms = {30, 40, 20};

System.out.println(vacuum.totalCleaningTime(rooms)); // => 45

int[] moreRooms = {30, 40, 50};

System.out.println(vacuum.canFinishCleaning(moreRooms, 50)); // => false

}
}
```
 */
public class Ex1 {
    public static void main(String[] args) {
        RobotVacuum vacuum = new RobotVacuum();
        System.out.println(vacuum.totalBatteryLife());
        System.out.println(vacuum.remainingBatteryLife(45));
        System.out.println(vacuum.cleaningTimePerRoom(30));
        int[] rooms = {30, 40, 20} ;
        System.out.println(vacuum.totalCleaningTime(rooms));
        int[] moreRooms = {30, 40, 50};
        System.out.println(vacuum.canFinishCleaning(moreRooms, 50));
    }
}
