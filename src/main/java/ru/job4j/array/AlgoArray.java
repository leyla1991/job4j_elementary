package ru.job4j.array;

public class AlgoArray {

    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        int num = array[4];
        array[4] = array[3];
        array[3] = num;
        int number = array[1];
        array[1] = array[2];
        array[2] = number;
        for (int i : array) {
            System.out.println(i);
        }
    }
}
