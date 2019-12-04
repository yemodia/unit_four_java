public class NestedLoops {
    public static String xSquare(){
        String finalString = "";
        for (int i = 1; i <= 5; i++){
            for (int x = 1; x <= 5; x++){
                finalString += "X";
            }
                finalString += "\n";
        }
        return finalString;
    }


    public static String xSquare2(int n){
        String finalString = "";
        for (int i = 1; i <= n; i++){
            for (int x = 1; x<= n; x++){
                finalString += "X";
            }
            finalString += "\n";
        }
        return finalString;
    }

    public static String flippedTriangle(int n){
        String finalString ="";
        for (int i = n; i >= 1; i--){
            for (int x = i; x >= 1; x--){
                finalString += "*";
            }
            finalString += "\n";
        }
        return finalString;

    }

    public static String multiplicationTable(){
        String finalString = "";
        for (int n = 1; n <= 9; n++){
            for (int x = 1; x <= 9; x++){
                if ((x * n) >= 10)
                finalString += " " + n * x;
                else
                    finalString += "  " + n * x;
            }
            finalString += "\n";
        }
        return finalString;
    }

    public static void main(String[] args){
        System.out.println(xSquare());
        System.out.println(xSquare2(8));
        System.out.println(flippedTriangle(8));
        System.out.println(multiplicationTable());

    }
}

