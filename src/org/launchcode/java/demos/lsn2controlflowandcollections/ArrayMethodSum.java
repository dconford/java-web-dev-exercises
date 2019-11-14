package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;

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



//class Message {
//
//    static String getMessage(String lang) {


