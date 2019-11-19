
import java.util.Scanner;

public class WhileLoops {
    static Scanner scan = new Scanner(System.in);

    public static String fromHereToThere(int num1, int num2){
        String bob = "";

         if (num1 > num2)
             return "Invalid input";
         while (num1 <= num2)
         {

         bob += num1 + " ";
             num1 ++;
         }
        return bob;
    }

    public static String factors(int X){
        String total = "";
        int Y = 1;
        while (Y <= X) {
            if (X % Y == 0)
                total += Y + " ";
        Y ++;}
        return "The factors of " + X + " are: " + total;
    }
    public static String countPosAndNeg(){

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

    public static String findMinAndMax(){
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
            if (num < min)
                min = num;
        }


        return "Max value is: " + max + "\nMin value is: " + min;
    }

    public static double gradePoint(){
        int inputs = 0;
        String userInput;
        double totalGrades = 0;
        double finalGpa;
        double GPA;



        while (inputs < 7) {
            System.out.print("Enter seven letter grades (A, B, C, D, or F)");
            userInput = scan.next();

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
         GPA = (int) (((totalGrades / inputs ) * 100) + 0.5) ;
        finalGpa = GPA / 100;
        return finalGpa;

    }


    public static void main(String[] args) {

        System.out.println(fromHereToThere(11,20));
        System.out.println(factors(5));
       System.out.println(countPosAndNeg());
       System.out.println(findMinAndMax());
        System.out.println(gradePoint());
    }
}

