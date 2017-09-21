


public class MethodsClass {
    public static boolean containsOne(int n) {
        if (n % 10 == 1) {

            String checkString = Integer.toString(n);
            return (checkString.contains("1"));
        }
        return false;
    }

}



// String checkString = Integer.toString(n);
// for (int i = 0; i< checkString.length() ; i++ {} or checkString.indexOf ("1") < 0);
// String checkString = Integer.toString(n);
// These are put 7-9 You can or Can not use a loop
// contains is expecting a char seq its a string


