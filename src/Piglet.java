/*
Yerim-Oumar Dia
AP Computer Science
November 20, 2019
This program is the simulation of a game called Piglet.
The user rolls a dice, and if anything but 1 shows up, they roll the dice and accumulate points
until the user decides to stop rolling the die.

 */




import java.util.Scanner;

public class Piglet {

    public static void diceRoll(){
        Scanner scan = new Scanner(System.in);
        int dice;
        int score = 0;
        while(true){
            dice = (int)(Math.random() * 6 + 1);
            if (dice == 1){
                System.out.println("You rolled a " + dice + ". \n You got 0 points");
                break;
            }
            else {
                score += dice;
                System.out.println("You rolled a " + dice +". \nRoll again?" );
                String play = scan.next();
                if (play.equals("no") || play.equals("No")){
                    System.out.println("You got " + score + " point(s)");
                    break;
                }
            }
        }
    }


    public static void main(String[] args){
        System.out.println("Welcome to Piglet Game!");
        diceRoll();

    }
}
