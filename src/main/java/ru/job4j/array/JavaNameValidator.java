package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean rsl;
        rsl = name.isEmpty()
                || (Character.isUpperCase(name.codePointAt(0))
                || Character.isDigit(name.codePointAt(0)));
        if (!rsl) {
            for (int i = 1; i < name.length(); i++) {
                int pcp = name.codePointAt(i);
                if (!isSpecialSymbol(pcp)
                        || !isUpperLatinLetter(pcp)
                        || !isLowerLatinLetter(pcp)
                        || !Character.isDigit(pcp)) {
                    rsl = false;
                    break;
                }
            }
        }
        return !rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return 97 <= code && code <= 122;
    }
}
