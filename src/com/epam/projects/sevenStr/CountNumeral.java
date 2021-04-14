//3. В строке найти количество цифр.
//Character::isDigit() — определяет, является ли указанное значение типа char цифрой.

package com.epam.projects.sevenStr;

public class CountNumeral {

    public static void main(String[] args) {

        String str = "I am 26 years old";
        long count = str.codePoints ().filter (Character::isDigit)
            .count ();
        System.out.println (count);
    }
}
