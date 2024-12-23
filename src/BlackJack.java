
/*
2.3.3

Instructions

In this exercise we will simulate the first turn of a Blackjack game.

You will receive two cards and will be able to see the face up card of the dealer. All cards are represented using a string such as "ace", "king", "three", "two", etc. The values of each card are:

card value card value

ace 11 eight 8

two 2 nine 9

three 3 ten 10

four 4 jack 10

five 5 queen 10

six 6 king 10

seven 7 other 0

Note: Commonly, aces can take the value of 1 or 11 but for simplicity we will assume that they can only take the value of 11.

Depending on your two cards and the card of the dealer, there is a strategy for the first turn of the game, in which you have the following options:

Stand (S)
Hit (H)
Split (P)
Automatically win (W)
Although not optimal yet, you will follow the strategy your friend Alex has been developing, which is as follows:
Category: Large Hand

If you have a pair of aces you must always split them.

If you have a Blackjack (two cards that sum up to a value of 21), and the dealer does not have an ace, a figure or a ten then you automatically win. If the dealer does have any of those cards then you'll have to stand and wait for the reveal of the other card.

Category: Small Hand

If your cards sum up to 17 or higher you should always stand.

If your cards sum up to 11 or lower you should always hit.

If your cards sum up to a value within the range [12, 16] you should always stand unless the dealer has a 7 or higher, in which case you should always hit.

The overall logic has already been implemented. You have four tasks:

Calculate the score of any given card.
Implement a function to calculate the numerical value of a card given its name using conditionals.
parseCard("ace")

// returns 11

2. Determine if two cards make up a Blackjack.

Implement a function that returns true if two cards form a Blackjack, false otherwise.

isBlackjack("queen", "ace")

// returns true

3. Implement the decision logic for hand scores larger than 20 points.

Implement a function that returns the string representation of a decision given your cards. This function is only called if the handScore is larger than 20. It will receive 2 arguments: isBlackJack and dealerScore. It should implement the bulletpoints in the category "Large Hand" above.

isBlackJack = true

dealerScore = 7

largeHand(isBlackJack, dealerScore)

// returns "W"

4. Implement the decision logic for hand scores with less than 21 points.

Implement a function that returns the string representation of a decision given your cards. This function is only called if the handScore is less than 21. It will receive 2 arguments: handScore and dealerScore. It should implement the bulletpoints in the category "Small Hand" above.

handScore = 15

dealerScore = 12

SmallHand(handScore, dealerScore)

// returns "H"
 */
public class BlackJack {

    public static void main(String[] args) {

        //1
        System.out.println(parseCard("ace"));
        //2
        System.out.println(isBlackjack("jack", "ace"));
        //3
        boolean isBlackJack = true;
        int dealerScore = 7;
        System.out.println(largeHand(isBlackJack, dealerScore));
        // returns "W"
        //4
        int handScore = 15;
        dealerScore = 12;
        System.out.println(smallHand(handScore, dealerScore));
    }

    private static String smallHand(int handScore, int dealerScore) {
        if (handScore >= 17) {
            return "S";
        } else if (handScore <= 11) {
            return "H";
        } else if (handScore >= 12 && handScore <= 16) {
            if (dealerScore >= 7) {
                return "H";
            } else {
                return "S";
            }
        }
        return "";
    }

    private static String largeHand(boolean isBlackJack, int dealerScore) {
        if (isBlackJack) {
            if (dealerScore < 10) {
                return "W";
            } else {
                return "S";
            }
        } else {
            return "P";
        }
    }

    private static boolean isBlackjack(String card1, String card2) {
        return (parseCard(card1) == 11 && parseCard(card2) == 10) || (parseCard(card1) == 10 && parseCard(card2) == 11);
    }

    public static int parseCard(String card) {
        switch (card) {
            case "ace":
                return 11;
            case "king", "queen", "jack", "ten":
                return 10;
            case "nine":
                return 9;
            case "eight":
                return 8;
            case "seven":
                return 7;
            case "six":
                return 6;
            case "five":
                return 5;
            case "four":
                return 4;
            case "three":
                return 3;
            case "two":
                return 2;
            default:
                return 0;
        }
    }
}
