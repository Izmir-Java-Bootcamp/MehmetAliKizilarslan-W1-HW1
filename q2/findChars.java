package week1.hw1.git.q2;


import java.util.Scanner;

public class findChars {
    public static void main(String[] args) {
        //ask for characters to search
        //ask for word
        //keep asking until user enter 'exit'
        Scanner scan = new Scanner(System.in);
        String chars = scan.nextLine();

        String word = scan.nextLine();
        while (!word.equals("exit")) {

            if (occursIn(chars, word))
                System.out.println(chars + " occurs in " + word);
            else
                System.out.println(chars + " does NOT occurs in " + word);

            //
            word = scan.nextLine();
        }

    }


    public static boolean occursIn(String chars, String word) {
        int occursIn = 0;
        for (int i = 0; i < chars.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (chars.charAt(i) == '*') {
                    break;
                } else if (word.charAt(j) == chars.charAt(i)) {
                    occursIn++;
                    i++;
                    break;
                }
            }
        }
        return occursIn == (chars.length() / 2) + 1;

    }
}

