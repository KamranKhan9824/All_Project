package Assistepractise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reGex {

	public static void main(String[] args) {
		final String str = "[A-Za-z ]+";
        final String check = "Java tutorial";
        final Pattern p = Pattern.compile(str);
        final Matcher m = p.matcher(check);
        while (m.find()) {
            System.out.println(check.substring(m.start(), m.end()));
        }

	}

}
