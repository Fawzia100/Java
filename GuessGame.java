import java.util.Scanner;

public class GuessGame {
        public static void main (String[] arg){
            int randomNumber = (int) (Math.random()*100)+1;
            System.out.println("I have randomly chosen a number between  1 and 100 ");
            System.out.println("Try to guess it: ");
            Scanner gscanner = new Scanner(System.in);
            int chances = 10;
            while (chances>0){
                int numberGuessed = gscanner.nextInt();
                if (numberGuessed == randomNumber){
                    System.out.println("You guessed the right number!");
                    break;
                } else if (numberGuessed < randomNumber) {
                    System.out.println("It is larger than " + numberGuessed + "\n you have" + chances + " guess(es) left:");
                    chances--;
                }else {
                    System.out.println("It is smaller than " + numberGuessed + "\n you have "+ chances + " guess(es) left:");
                    chances--;
                }
                if (chances==0){
                    System.out.println("Sorry, you've run out of chanes, the number was "+ randomNumber + ".");
                }
            }

        }
    }

