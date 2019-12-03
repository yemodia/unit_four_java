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


    public static void main(String[] args){
        System.out.println(xSquare());
        System.out.println(xSquare2(100));

    }
}

