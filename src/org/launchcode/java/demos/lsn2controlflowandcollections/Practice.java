package org.launchcode.java.demos.lsn2controlflowandcollections;

public class Practice {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++ ) {
            System.out.println(i);
        }

        for (int i = 100; i >= 0; i -= 5) {
            System.out.println(i);
        }

        int[] numsExample = {1, 1, 2, 3, 5, 8, 13, 21, 42};

        for (int i : numsExample) {
            System.out.println(i);
        }

        String msg = "Hello World";

        for (char c : msg.toCharArray()) {
            System.out.println(c);
        }

        int m = 0;
        while (m < 8) {
            System.out.println(m);
            m++;
        }

        boolean runLoop = true;
        int j = 0;
        do {
            if (j < 5) {
                System.out.println("Hello, World");
                j ++;
            } else {
                runLoop = false;
            }
        } while (runLoop);

        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 55;
        for (int oneInt : someInts) {
            if (oneInt == searchTerm) {
                System.out.println("Found it!");
                break;
            }
        }


    }
}
