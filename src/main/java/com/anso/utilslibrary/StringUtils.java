package com.anso.utilslibrary;


public class StringUtils {

    public static boolean isEmpty(String string) {
        return !(string != null && string.length() > 0);
    }
}
