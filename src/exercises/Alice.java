package exercises;

import java.util.Scanner;

public class Alice  {
    private static final String ALICE_LINE ="Alice was beginning to get very tired of sitting by her sister " +
            "on the bank, and of having nothing to do: once or twice she had peeped into the book her sister" +
            " was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought" +
            " Alice 'without pictures or conversation?'";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text to search for:");
        String searchFor = input.next().toLowerCase();
        input.close();
        boolean foundMatch = true;
        int indexOfMatch = ALICE_LINE.toLowerCase().indexOf(searchFor);

        if (indexOfMatch > 0) {
            //variables
            int wordLength = searchFor.length();
            int secondPartIndex = indexOfMatch + wordLength;
            String firstPart = ALICE_LINE.substring(0, indexOfMatch);
            String secondPart = ALICE_LINE.substring(secondPartIndex);
            String newAliceLine = firstPart.concat(secondPart);
            //output
            System.out.println("the text you are searching for can be found within the first line of Alice. Its Index is " + indexOfMatch + " and its length is " +  searchFor.length());
            System.out.println("the text you are searching is for " + ALICE_LINE.substring(indexOfMatch, indexOfMatch + wordLength));
            System.out.println("firstPart = " + firstPart);
            System.out.println("---------------------------------------------------------------------");
            System.out.println("secondPart = " + secondPart);
            System.out.println("---------------------------------------------------------------------");
            System.out.println( "The new Alice Line is: \n" + newAliceLine);


        } else {
            System.out.println("the text you are searching for was not found within the first line of Alice.");
        }
    }
}


//str.equals(otherString)


/*

if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("it")) {
            return "Ciao, Mundi!";
        } else {
            return "Hello, World!";
        }

public class HelloMethods {

    public static void main(String[] args) {
        String message = Message.getMessage("");
        System.out.println(message);
    }

}


    Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'

 */