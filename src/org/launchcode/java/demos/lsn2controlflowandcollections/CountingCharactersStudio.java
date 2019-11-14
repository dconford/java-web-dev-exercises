package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Map;

public class CountingCharactersStudio {

    public static void main(String[] args) {

        String thisString = "If the product of two terms is zero then common sense says at least one of the " +
                "two terms has to be zero to start with. So if you move all the terms over to one side, you " +
                "can put the quadratics into a form that can be factored allowing that side of the equation " +
                "to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> characterCounts = new HashMap<>();
//i, o, s, should go up by 1: 12, 32, and 17 respectively.
        char[] charactersInString = thisString.toLowerCase().toCharArray();
        for (char singleCharacter : charactersInString) {
            if (!characterCounts.containsKey(singleCharacter)) {
                characterCounts.put(singleCharacter, 1);
                //System.out.println("Char " + charactersInString[i] + " not found");
            } else {
                Integer oldCount = characterCounts.get(singleCharacter);
                //System.out.println("Old Key/Value pair is " + charactersInString[i] + "/" + characterCounts.get(charactersInString[i]));
                oldCount++;
                characterCounts.replace(singleCharacter, oldCount);
                //System.out.println("New Key/Value pair is " + charactersInString[i] + "/" + characterCounts.get(charactersInString[i]));

            }

            //System.out.println(charactersInString[i]);
        }
        //System.out.println(charactersInString);
        for (Map.Entry<Character, Integer>  characterCount: characterCounts.entrySet()) {
            if (Character.isLetter(characterCount.getKey())) {
                System.out.println("For character " + characterCount.getKey() + " : Count = " + characterCount.getValue());
            }
        }

    }
}


/*

public class Program {
    public static void main(String[] args) {

        String value = "abc123";
        // Loop through characters in this String.
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);

            // See if the character is a letter or not.
            if (Character.isLetter(c)) {
                System.out.println(c + " = LETTER");
            } else {
                System.out.println(c);
            }
        }
    }
}

//Input
key/value pair key=chars value=count
convert string to array of chars
then read array as input to (2) ArrayLists (char[], lists of chars in string; int[], count of each char. or HashMap
if (indexOf(char from array) not found) then
push char(key) and value = 1.
else value of (indexOf(char from array) = value++.

//Output
for each key in list
print key/value
 */