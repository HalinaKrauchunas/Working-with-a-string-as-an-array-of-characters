//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние
// пробелы в строке удалить.

package com.epam.projects.sevenStr;

public class Delete {

    public static void main(String[] args) {
        String str = "  My    name  is    Halina. ".strip ();
        System.out.println (str.replaceAll ("\\s+", " "));
    }
}
