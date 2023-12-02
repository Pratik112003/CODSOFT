import java.util.Scanner;
import java.util.Random;

 class GuessTheNumber {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random random = new Random();
            int lowerBound, upperBound, number, guess, attempts, score;
            boolean playAgain = true;

            System.out.println("Welcome to the Guess the Number game!");

            while (playAgain) {
                System.out.println("Enter the range of numbers you want to guess from:");
                System.out.print("Enter the lower bound: ");
                lowerBound = input.nextInt();
                System.out.print("Enter the upper bound: ");
                upperBound = input.nextInt();
                number = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
                attempts = 0;
                score = 0;

                while (true) {
                    System.out.print("Guess the number: ");
                    guess = input.nextInt();
                    attempts++;

                    if (guess == number) {
                        System.out.printf("Congratulations! You guessed the number in %d attempts.\n", attempts);
                        score += attempts;
                        break;
                    } else if (guess < number) {
                        System.out.println("Too low. Try again.");
                    } else {
                        System.out.println("Too high. Try again.");
                    }

                    if (attempts == 5) {
                        System.out.println("You have reached the maximum number of attempts.");
                        break;
                    }
                }

                System.out.printf("Your score for this round is %d.\n", score);

                System.out.print("Do you want to play again? (y/n) ");
                String playAgainString = input.next().toLowerCase();

                while (!playAgainString.equals("y") && !playAgainString.equals("n")) {
                    System.out.print("Invalid input. Please enter y or n: ");
                    playAgainString = input.next().toLowerCase();
                }

                playAgain = playAgainString.equals("y");
            }
        }
        System.out.println("Thanks for playing!");
    }
}
