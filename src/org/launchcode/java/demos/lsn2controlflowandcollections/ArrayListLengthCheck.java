package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLengthCheck {
    //import java.util.ArrayList;
    static void wordMatch(List<String> listOfWords, Integer searchLength) {
        for (String wordFrom: listOfWords) {
            if (wordFrom.length() == searchLength) {
                System.out.println(wordFrom);
            }
        }
    }
}


/*
public class ArrayMethodSum {
        static Integer sumArrayList(ArrayList<Integer>listOfNumbers){

            Integer sum = 0;
            System.out.println("Method called " + sum);
            for (Integer numb: listOfNumbers) {
                //System.out.println(numb);
                sum += numb;
            }
            System.out.println("Method Exit " + sum);
            return sum;
        }
    }
 */