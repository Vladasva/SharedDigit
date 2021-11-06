public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2){
        if((number1 < 10) || (number1 > 99) || (number2 < 10) || (number2 > 99)){
            return false;
        }

        String isShared = "";

        while ((number1 != 0) && (number2  != 0)){
           int digit1 = number1 % 10;
           number1 /= 10;

           int digit2 = number2 % 10;
           number2 /= 10;

           System.out.println(digit1);
           System.out.println(digit2);

           if (digit1 == digit2){
               isShared = "Yes";
           } else {
               isShared = "No";
           }
       }
        if (isShared == "Yes"){
            return true;
        } else{
            return false;
        }
    }

}
