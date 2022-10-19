package com.beksucsm.oop.lessonStringHW;

public class Task1 {

    private static final String EMPTY = "";
    private static final String SPACE = " ";

    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";
        String result = deleteDuplicates(value);
        System.out.println(result);
    }

    public static String deleteDuplicates(String value) {
        value = value.replace(SPACE, EMPTY).toUpperCase();
        StringBuilder resultValue = new StringBuilder(value);
        for (int i = value.length() - 1, j = i - 1; i > 0; i--, j--) {
            if (value.charAt(i) == value.charAt(j)) {
                resultValue.deleteCharAt(j);
//                System.out.println("Duplicate"); // used for check
            }
        }
        return resultValue.toString();
    }
}
