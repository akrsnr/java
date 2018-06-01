// Only for rememberance how extraction works with groups java

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PatternMatcher {
    public static void main(String[] args) {

        String input = "foto_20180601_1.jpg\n" +
                " foto_20180601_10.jpg\n" +
                " foto_20180601_100.jpg\n" +
                " foto_20180601_1000.jpg";

        Pattern p = Pattern.compile("foto_\\d{8}_(\\d+)");
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println("Found a group(0) -> " + m.group(0) + " ~~ " + "Found a group(1) -> " + m.group(1));
        }

    }
}
