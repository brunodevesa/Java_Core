/**
 * Created by brunodevesa on 16/09/16.
 */

/**
 * Replace characters in a string
 */

public class MyAwesomeClass {


    String myString = "sdafdfa";

    private String getMyString() {
        return myString;
    }


    public static void main(String args[]) {

        MyAwesomeClass mc = new MyAwesomeClass();
        String myString = mc.getMyString();

        System.out.println("original string : ");
        System.out.println("string with no vogals : " + mc.removeVogals(myString));

    }

    /**
     * Replaces a chosen character by another chosen character
     *
     * @param string
     * @return
     */
    private StringBuilder removeVogals(String string) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == 'a') {
                stringBuilder.append("|");
            } else {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder;
    }

}
