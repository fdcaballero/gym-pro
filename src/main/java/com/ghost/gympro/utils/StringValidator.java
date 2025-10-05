package com.ghost.gympro.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class StringValidator {

    protected final Pattern pattern;

    protected StringValidator(String REGEX) {
        pattern = Pattern.compile(REGEX);
    }


    public boolean isValid(final String param){
        if (param == null) {
            return false;
        }
        Matcher matcher = pattern.matcher(param);
        return matcher.matches();
    }

   abstract String validateAndGetError (String param);

}
