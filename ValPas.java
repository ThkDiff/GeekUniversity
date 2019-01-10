package AdditionalTaskPassword;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValPas {
    public static void main(String[] args) {
        String s = "sS1@sS1@s";
        System.out.println(IsValid(s));
    }
    public static boolean IsValid(String s){
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@*&%$!^+=])(?=\\S+$).{8,}");
        Matcher m = pattern.matcher(s);
        return m.find();
    }
}
