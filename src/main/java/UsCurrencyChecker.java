import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.regex.Matcher;

public class UsCurrencyChecker {
    public static Matcher getMatcher(String usCurrencyString) {
        String regex = "\\$\\s?\\d+(\\.\\d{1,2})?";
        Pattern pattern = Pattern.compile(pattern);
        return pattern.matcher(usCurrencyString);
    }
}
