package com.beksucsm.oop.lessonStringHW;


/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 * <p>
 * <p>
 * <p>
 * Два вопроса:
 * Как быть с длиной массива,хз что с инициализацией,как оптимизировать и не занимать лишние ячейки
 * И что делать с тем случаем когда может быть Нуль в массиве,не пользоваться свитч? или же изменить дефаулт
 */


public class Task2 {
    public static void main(String[] args) {

        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] result = numbersToArray(value);
        printArray(result);
        int sumNum = sumOfNumbers(result);
        System.out.println(sumNum);
    }

    public static int[] numbersToArray(String value) {
        char[] charArray = value.toCharArray();
        int arraySize = 10;
        int[] resultArray = new int[arraySize];
        int j = 0;
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (getNumber(ch) != 0) {
                resultArray[j] = getNumber(ch);
                j++;
            }
        }
        return resultArray;
    }

    public static void printArray(int[] result) {
        for (int j : result) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int getNumber(char numChar) {
        return switch (numChar) {
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;

            default -> 0;
        };
    }

    public static int sumOfNumbers(int[] result) {
        int sum = 0;
        for (int i : result) {
            sum += i;
        }
        return sum;
    }
}


