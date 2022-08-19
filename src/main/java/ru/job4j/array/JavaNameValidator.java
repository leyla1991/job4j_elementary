package ru.job4j.array;

public class JavaNameValidator {

    static boolean rsl = false;

    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            rsl = false;
        }

        for (int i = 1; i < name.length(); i++) {
            if (Character.isUpperCase(name.codePointAt(0))
                    || Character.isDigit(name.codePointAt(0))) {
                rsl = false;
                break;
            }
            int pcp = name.codePointAt(i);
            if (isSpecialSymbol(pcp)
                    || isUpperLatinLetter(pcp)
                    || isLowerLatinLetter(pcp)
                    || Character.isDigit(pcp)) {
                rsl = true;
            }
        }
        return rsl;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {
            rsl = true;
        }
        return rsl;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 65 && code <= 90) {
            rsl = true;
        }
        return rsl;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (97 <= code && code <= 122) {
            rsl = true;
        }
        return rsl;
    }
}
