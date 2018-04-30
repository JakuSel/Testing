package sk.akademiasovy.testing;

import java.util.regex.Pattern;

public class TestReg {

    public static final Pattern PATTERN = Pattern.compile(
            "^(([0-1]?[0-9][0-9]?|2[0-4][0-9]?|25[0-5])\\.){3}([0-1]?[0-9][0-9]?|2[0-4][0-9]?|25[0-5])$");


    public static boolean validate(String ip) {

    if (PATTERN.matcher(ip).matches())
            return true;
    else
        return false;
    }

}
