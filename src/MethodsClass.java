


public class MethodsClass {

    private static final int SPEED_LIMIT =  60;
    private static final Object HIGHS_SPEED = 80;

    public static int caughtSpeeding (int speed, boolean isBirthday) {

        int returnValue = -2;

        if (speed > SPEED_LIMIT) returnValue =0;
        if (speed > SPEED_LIMIT && speed <= HIGHS_SPEED) {

            if (isBirthday) {
                // Bump up speed Limit += 5 Its a constatnt so what if we changed it

            }
        }


            returnValue =1;

        return returnValue ; //Always fail first
    }

    public static boolean containsOne(int n) throws BadInputExc {
        if (n < 0)
        throw new BadInputExc();


        String numString = "" + n; //Convert the number to a string
        return numString.contains("1"); //Check to see if it contains 1
    }
}


// String checkString = Integer.toString(n);
// for (int i = 0; i< checkString.length() ; i++ {} or checkString.indexOf ("1") < 0);
// String checkString = Integer.toString(n);
// These are put 7-9 You can or Can not use a loop
// contains is expecting a char seq its a string


