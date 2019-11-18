import javax.swing.*;
import java.util.Scanner;

public class WhileLoops {
    static Scanner scan = new Scanner(System.in);

    public static String fromHeretoThere(int num1, int num2){
        String bob = "";
        System.out.print(num1 + " ");

         if (num1 < num2)

         while (num1 != num2)
         {
             num1 ++;
         bob += num1 + " ";
         }
         else
            return "Invalid Input";
        return bob;
    }

    public static String factors(int X){
        String total = "";
        int Y = 1;
        while (Y <= X) {
            if (X % Y == 0)
                total += Y + " ";
        Y ++;}
        return total;
    }
    private static String countPosAndNeg(){

        System.out.print("Enter a positive or negative number or 0 to quit: ");
        int userNum = scan.nextInt();
        int totalPos = 0;
        int totalNeg = 0;
        while (userNum != 0) {
            if (userNum > 0)
                totalPos++;
            else if (userNum < 0)
                totalNeg++;
            System.out.print("Enter a positive or negative number or 0 to quit: ");
             userNum = scan.nextInt();
        }
        return "There were " + totalPos + " positive and " + totalNeg + " negative numbers.";
    }

    private static String findMinAndMax(){
        int inputs = 0;
        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;



        while (inputs < 5) {
            System.out.print("Number: ");
             num = scan.nextInt();

            inputs++;
            if (num > max)
                max = num;
            else if (num < min)
                min = num;
        }
        return "Max Value is:" + max + "\nMin Value is" + min;

    }

    private static String gradePoint(){
        int inputs = 0;
        String userInput;
        double totalGrades = 0;
        double finalGpa;
        double GPA;



        while (inputs < 7) {
            System.out.print("Enter seven letter grades (A, B, C, D, or F)");
            userInput = scan.nextLine();

            if (userInput.equals("A") || userInput.equals( "a"))
                totalGrades += 4.0;

            else if (userInput.equals("B")  || userInput.equals("b"))
                totalGrades += 3.0;

            else if (userInput.equals("C")|| userInput.equals("c"))
                totalGrades += 2.0;

            else if (userInput.equals("D") || userInput.equals("d"))
                totalGrades += 1.0;

            else
                totalGrades += 0.0;

            inputs++;
        }
         GPA = (int) (((totalGrades /7 )* 100) + 0.5) ;
        finalGpa = GPA / 100;
        return "GPA  = " + finalGpa;

    }


    public static void main(String[] args) {


        //System.out.println(fromHeretoThere(15, 26));
        //System.out.println(factors(6));
        //System.out.println(countPosAndNeg());
        //System.out.println(findMinAndMax());
        System.out.println(gradePoint());
    }
}

