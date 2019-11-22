public class StringExercises {


    public static String printTheLetters(String whatever){
        String letters ="";
        for ( int i = 0; i < whatever.length(); i++){
            letters += whatever.substring(i, i + 1 ) + "\n";

        }
        return letters;
    }

    public static String everyOtherLetter(String s){
        String finalString = "";
        for (int i = 0; i < s.length(); i+= 2)
            finalString += s.substring(i, i+1 );
        return finalString;
    }

    public static int countTheVowels(String s){
        int finalVowels = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if  (s.substring(i, i+1).equals("a") || s.substring(i, i+1).equals("e") || s.substring(i, i+1).equals("i")
                    || s.substring(i, i+1).equals("o")|| s.substring(i,i+1).equals("u"))
                finalVowels++;
        }
        return finalVowels;
    }

public static String differentStrings(String s1, String s2){
        String finalDifference = "";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.equals(s2)){
           return s1 + " and " + s2 + " are the same.";
        }
        int x = 0;
        if (s1.length() > s2.length())
            s2 += " ";
        else if (s1.length() < s2.length())
            s1 += " ";
            while(s1.substring(x, x+1).equals(s2.substring(x,x+1)))
                x++;

    return s1 + " and " + s2 + " are not the same. They differ at letter number " + (x+1);
}

public static boolean isPalindrome(String s){
        String sBack = "";
        for (int i = s.length()-1; i >= 0; i--)
            sBack += s.substring(i, i + 1);
        if (sBack.equals(s))
            return true;
        else
            return false;



}

    public static void main(String[] args){

        System.out.println(printTheLetters("Pizza"));
        System.out.println(everyOtherLetter("Computer Science"));
        System.out.println(countTheVowels("Computer Science"));
        System.out.println(differentStrings("Pizza", "Pizza"));
        System.out.println(differentStrings("bowl", "Bowling"));
        System.out.println(differentStrings("tiger", "turtle"));
        System.out.println(isPalindrome("racecars"));

    }
}

