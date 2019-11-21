public class StringExercises {


    public static String printTheLetters(String whatever){
        String letters ="";
        int numLetters = whatever.length();
        for ( int i = numLetters; numLetters >= 0; numLetters--)
            letters += whatever.substring(i,i);
        return letters + "\n";    }

    public static void main(String[] args){
        System.out.println(printTheLetters("Pizza"));
    }
}

