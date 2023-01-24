package Chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^agent-0*[1-9]+");
        Matcher matcher = pattern.matcher("agent-0001");
        System.out.println(matcher.find());
    }
}
