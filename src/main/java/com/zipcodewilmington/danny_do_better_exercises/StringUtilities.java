package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        String helloWorld= "Hello World";
        return helloWorld;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        String result = firstSegment + secondSegment;
        return result;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        String result = (String)(firstSegment + secondSegment);
        return result;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String substring = input.substring(0,3);
        return substring;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        int suffixIndex = input.length() - 3;
        String suffix = input.substring(suffixIndex, suffixIndex + 3);
        System.out.println(suffix);
        return suffix;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
       int midChar = inputValue.length()/2;
        char middle = 0;

       if (midChar % 2 == 0) {
           midChar -= 1;
           middle = inputValue.charAt(midChar);
       } else if (midChar % 2 == 1) {
           midChar = inputValue.length()/2;
           middle = inputValue.charAt(midChar);
        }
       return middle;
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String[] words = spaceDelimitedString.split(" ");
        System.out.println(words[0]);
        return words[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] words = spaceDelimitedString.split(" ");
        System.out.println(words[1]);
        return words[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        String reverse = "";

        for (int i= stringToReverse.length() -1; i >= 0; i--) {
            reverse += stringToReverse.charAt(i);
        }
        System.out.println(reverse);
        return reverse;
    }
}