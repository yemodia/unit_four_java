public class FizzBuzz {
    public static String fizzBuzz(int num) {
        String finalString = "";
        for (int first = 1; first <= num; first++) {
            if (first % 3 == 0 && first % 5 == 0)
                finalString += "FizzBuzz" + " ";
            else if (first % 5 == 0)
                finalString += "Buzz" + " ";
            else if (first % 3 == 0)
                finalString += "Fizz" + " ";
            else
                finalString += first + " ";

        }
        return finalString;
    }

    public static void main(String[] args){
        System.out.println(fizzBuzz(100));
    }
}
