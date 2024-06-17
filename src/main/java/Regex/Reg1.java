package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1
{
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[\\S]");
        Matcher m=p.matcher("abcd1234A     BCD!@#$%^");
        while (m.find())
        {
            System.out.println(m.start()+"--------->"+m.group());
        }
    }
}
