package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex001 {
    /*
Napisz Regex, który sprawdza polskie numery telefonów komórkowych,
zaczynające się cyfrą 5.
 */
    private static final Pattern PATTERN = Pattern.compile("5[0-9]{8}");

        /*
        Prawda dla tekstu: 515332123
        Prawda dla tekstu: 515336293
        Fałsz dla tekstu: 415336293
        Fałsz dla tekstu: 615332123
        Fałsz dla tekstu: 715332123
        Fałsz dla tekstu: 712123
        Fałsz dla tekstu: 51123
         */


    public static void main(String[] args) {
        RegexTester tester = new RegexTester("(\\+48)?5[0-9]{8}");
        tester.validate("+48515123456"); //true
        tester.validate("+48715123456"); //false
        tester.validate("515332123");
        tester.validate("515336293");
        tester.validate("415336293");
        tester.validate("615332123");
        tester.validate("715332123");
        tester.validate("712123");
        tester.validate("51123");
    }
}


