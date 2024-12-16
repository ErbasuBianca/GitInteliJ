import java.util.Random;

/*

Exercise: Bake a Delicious Cake
You are going to write code to help a baker manage the time required to bake a cake.

The tasks below will guide you through implementing methods that calculate different
times involved in the cake-baking process.
1. Define the expected baking time in minutes
Define a method expectedMinutesInOven() that does not take any parameters and returns
how many minutes the cake should

be in the oven. According to the baker's recipe, the expected baking time in minutes is 50.

Cake cake = new Cake();

cake.expectedMinutesInOven();

// => 50

2. Calculate the remaining baking time in minutes

Define the remainingMinutesInOven() method. It should take the actual minutes the cake has been
in the oven as a parameter and return
how many minutes the cake still has to remain in the oven, based on the expected baking time.

Cake cake = new Cake();

cake.remainingMinutesInOven(20);

// => 30


3. Calculate the preparation time in minutes

Define the preparationTimeInMinutes() method that takes the number of cake layers as a parameter. Each layer requires 5 minutes to prepare.

The method should return how many minutes the baker spent preparing the cake layers.

Cake cake = new Cake();
cake.preparationTimeInMinutes(3);

// => 15


4. Calculate the total working time in minutes

Define the totalTimeInMinutes() method that takes two parameters:

The number of layers in the cake.
The number of minutes the cake has been in the oven.
The method should return the total time spent on baking the cake,
which is the sum of the preparation time and the baking time so far.

Cake cake = new Cake();
cake.totalTimeInMinutes(4, 25);

// => 45

*/
public class JavaCake {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.expectedMinutesInOven();
        cake.remainingMinutesInOven(20);
        cake.preparationTimeInMinutes(3);
        cake.totalTimeInMinutes(4, 25);
        System.out.println(cake.expectedMinutesInOven());
        System.out.println(cake.remainingMinutesInOven(20));
        System.out.println(cake.preparationTimeInMinutes(3));
        System.out.println(cake.totalTimeInMinutes(4, 25));

    }
}
