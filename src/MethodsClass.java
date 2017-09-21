


public class MethodsClass {

    private static final int SPEED_LIMIT =  60;
    private static final int HIGH_SPEED = 80;

    public static int caughtSpeeding (int speed, boolean isBirthday) {

        int returnValue = -2;
        int speedLimit = SPEED_LIMIT;
        int highSpeed = HIGH_SPEED;

        if (isBirthday) {
            highSpeed += 5;
            speedLimit +=5;
        }
        if (speed<= speedLimit)
            returnValue =0;

        else if (speed > SPEED_LIMIT) returnValue = 0;
        else if(speed > SPEED_LIMIT && speed <= HIGH_SPEED) returnValue =1; {
            else returnValue = 2;

           return returnValue = 2;

        }



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


