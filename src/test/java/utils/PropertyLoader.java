package test.java.utils;

import java.util.ResourceBundle;

public class PropertyLoader {
    private static ResourceBundle src = ResourceBundle.getBundle("config"); //название файла без расширения
    public static String getProperty(String value){
        return src.getString(value);   // на месте value будет значение как в config  файле
    }
}
