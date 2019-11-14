package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MorePractice {
    public static void main(String[] args) {

        String drSuess = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        int[] nums = {1, 1, 2, 3, 5, 8, 13, 21};
        for (int i: nums) {
            if(i % 2 != 0) {
                System.out.println("The Value in of nums Array is " + i);
            }
        }

        String[] drSuessArray = drSuess.split(" ");
        for (String word: drSuessArray) {
            System.out.println(word);
        }
        System.out.println(Arrays.toString(drSuessArray));

        List<String> drSuessList = new ArrayList<>();
        drSuessList = Arrays.asList(drSuessArray);
        for (String wrds: drSuessList) {
            System.out.println(wrds);
        }

        String[] drSuessArray2 = drSuess.split("\\.");
        for (String word2: drSuessArray2) {
            System.out.println(word2.trim());
        }

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(3);
        listOfNumbers.add(13);
        listOfNumbers.add(7);
        listOfNumbers.add(9);
        listOfNumbers.add(6);
        listOfNumbers.add(28);
        listOfNumbers.add(8);
        listOfNumbers.add(18);

        Integer sum = ArrayMethodSum.sumArrayList(listOfNumbers);
        System.out.println("The result is " + sum);

        ArrayList<String> listOfWords = new ArrayList<>();
        listOfWords.add("plus");
        listOfWords.add("minus");
        listOfWords.add("sweet");
        listOfWords.add("bear");
        listOfWords.add("cat");
        listOfWords.add("dog");
        listOfWords.add("hear");
        listOfWords.add("bed");
        listOfWords.add("log");
        listOfWords.add("read");
        listOfWords.add("james");
        listOfWords.add("beard");
        listOfWords.add("grin");
        listOfWords.add("bearit");
        listOfWords.add("beer");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of words to search for:");
        int searchLength = input.nextInt();
        input.close();
        //ArrayListLengthCheck.wordMatch(listOfWords, searchLength);
        ArrayListLengthCheck.wordMatch(drSuessList, searchLength);

    }
}

