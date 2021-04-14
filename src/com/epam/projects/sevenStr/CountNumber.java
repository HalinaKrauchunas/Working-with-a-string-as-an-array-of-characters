//4. В строке найти количество чисел.
//find, находит подстроку, которая удовлетворяет РВ.
package com.epam.projects.sevenStr;

import java.util.regex.*;

public class CountNumber {

    public static void main(String[] args) {

        String str = "I am 26 years old";
        int count = 0;
        Matcher matcher = Pattern.compile ("(\\d+)").matcher (str);
        while (matcher.find ()) {
            count++;
        }
        System.out.println ("Count numbers: " + count);
    }
}