package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        for (int index = array.length - 1, i = 0; i  < array.length / 2; index--, i++) {
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
            }
        return array;
    }
}
