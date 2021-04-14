//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

package com.epam.projects.sevenStr;

import java.util.*;

public class CamelCase {

    public static void main(String[] args) {

        String[] str = {"countString", "maxCount", "rightAngle"};
        ArrayList<String> newStr = new ArrayList<> ();

        for (String name : str) {
            for (int i = 0; i <= name.length () - 1; i++) {
                if (Character.isUpperCase (name.charAt (i))) {
                    StringBuilder strings = new StringBuilder ();
                    strings.append (name);
                    newStr.add (strings.insert (i, "_").toString ().toLowerCase ());
                    strings.delete (0, strings.length ());
                }
            }
        }
        System.out.println (newStr);
    }
}