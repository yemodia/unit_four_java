
public class ForLoops {
    public static String printingHashTags(int numHashes){
        String finalHashes = "";

        for (int count = 0; count < numHashes; count++ )
            finalHashes += "#";
        return finalHashes;
    }

    public static String countDown(int num1, int num2){
        String finalCountdown = "";

        if (num1 < num2){
            for (int i = num2; i >= num1; i--){
                finalCountdown += i + " ";

            }
            return finalCountdown;
        }
        else if (num1 == num2) {
            finalCountdown += num1 + " ";
            return finalCountdown;
        }
        else
            return "";
    }

    public static String countDown2(int num1, int num2){
        String finalCountdown = "";
        if (num1 < num2){
            for (int i = num2; i >= num1; i--){
                finalCountdown += i + " ";

            }
        }
        else if(num1 > num2){
            for (int i = num1; i >= num2; i--)
                finalCountdown += i +" ";
        }
        else if(num1== num2)
            finalCountdown += num1 + " ";

        return finalCountdown;
    }

    public static int sumNumbers(int num1, int num2){
        int finalSum = 0;

        if (num1 < num2){
            for (int i = num2; i >= num1; i--)
                finalSum += i;}
        else if (num1 > num2){
            for (int i = num1; i >= num2; i--)
                finalSum += i; }
        else if (num1 == num2)
            finalSum += num1;

        return finalSum;
    }

    public static void main(String[] args){
        System.out.println(printingHashTags(6));
        System.out.println(printingHashTags(21));

        System.out.println(countDown(0,10));
        System.out.println(countDown2(13,7));
        System.out.println(countDown2(0,10));
        System.out.println(countDown2(12,8));
        System.out.println(sumNumbers(5,10));
        System.out.println(sumNumbers(10,10));
        System.out.println(sumNumbers(11,10));
    }
}
