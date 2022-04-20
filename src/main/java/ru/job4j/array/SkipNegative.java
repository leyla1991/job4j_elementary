package ru.job4j.array;

public class SkipNegative {

    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int index = 0; index < array[i].length; index++) {
                if (array[i][index] < 0) {
                    array[i][index] = 0;
                }
            }
        }
        return array;
    }
}
