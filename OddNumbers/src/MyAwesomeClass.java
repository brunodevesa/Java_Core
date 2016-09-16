/**
 * Created by brunodevesa on 16/09/16.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Return all the odd number from 0 to 100.
 * Return all fibonacci sequence till 100
 */


public class MyAwesomeClass {


    public List<Integer> collectOddNumbers() {

        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {

            if ((i % 2) != 0) {
                //is odd number
                numberList.add(i);
            }
        }
        return numberList;
    }

    public List<Integer> collectFibbonnaciNumbers() {
        List<Integer> numberList = new ArrayList<>();

        //num(i) = num(i-1) + num(i-2) recursion rule

        int current= 0;
        int previous = 1;
        int previousOfPrevious = 0;
        numberList.add(current);

        while(current<100){

            current = previous + previousOfPrevious;
            numberList.add(current);

            previousOfPrevious = previous;
            previous = current;

        }
        return numberList;
    }

    public static void main(String args[]) {

        MyAwesomeClass mc = new MyAwesomeClass();

        System.out.println("odd number:");
        List<Integer> myOddNumbersList = mc.collectOddNumbers();

        for (int i = 0; i < myOddNumbersList.size(); i++) {
            System.out.print(myOddNumbersList.get(i) + "|");
        }
        System.out.println();
        System.out.println("..............................");
        System.out.println("fibo numbers:");
        List<Integer> myFiboNumbersList = mc.collectFibbonnaciNumbers();

        for (int i = 0; i < myFiboNumbersList.size(); i++) {
            System.out.print(myFiboNumbersList.get(i) + "|");
        }

    }

}
