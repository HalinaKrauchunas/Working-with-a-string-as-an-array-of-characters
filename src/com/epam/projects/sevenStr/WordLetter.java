//2. Замените в строке все вхождения 'word' на 'letter'.

package com.epam.projects.sevenStr;

public class WordLetter {

    public static void main(String[] args) {
        String str = "word and word";
        System.out.println (str.replaceAll ("word", "letter"));
    }
}
