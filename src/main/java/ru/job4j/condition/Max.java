package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) { return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int left, int second, int third, int four) {
        return max(left, max(second, max(third, four)));
    }

    public static void main(String[] args) {
        int num = Max.max(21, 15);
        System.out.println(num);
    }
}
