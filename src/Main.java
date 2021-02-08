import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int playerNumber, computerNumber;
        String again;
        Random rand = new Random();
        Scanner read = new Scanner(System.in);
        do {
            //computer generates random  number 1 - 100
            computerNumber = rand.nextInt(99) + 1;

            do {
                //prompt a user to pick a number
                System.out.println("Please pick a number from 1 to 100.");

                //get user input
                playerNumber = read.nextInt();
                read.nextLine();


                if (computerNumber == playerNumber) {
                    System.out.println("correct!");
                } else if (computerNumber > playerNumber) {
                    System.out.println("Higher");
                } else {
                    System.out.println("Lower");
                }


            } while (computerNumber != playerNumber);

            System.out.println("You Won!!");
            System.out.println("Would you like to play again? Enter Y or N");
            again = read.nextLine();
        }while(again.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");




    }
}

