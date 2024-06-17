package Regex;

import java.util.regex.Pattern;

public class FName_Valid {
    public boolean validMethod(String name) {
        Pattern p = Pattern.compile("^[A-Z][a-z]+$");
        return p.matcher(name).matches();
    }

    public boolean validMethodL(String lname) {
        Pattern p = Pattern.compile("^[A-Z][a-z]+$");
        return p.matcher(lname).matches();
    }

    public boolean validEmail(String email)
    {
        Pattern p =Pattern.compile("^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,}$");
//        Pattern p=Pattern.compile("^[A-Za-z0-9._]@{1}[a-zA-Z][.]{1}[a-zA-Z]{2,4}$");
        return p.matcher(email).matches();
    }
    public boolean validPhNo(String email)
    {
        Pattern p=Pattern.compile("^[+][9][1][789]{1}[0-9]{9}$");
//        Pattern p=Pattern.compile("^[789]{1}[0-9]{9}$");
        return p.matcher(email).matches();
    }
    public boolean validPWD(String pwd)
    {
        Pattern p=Pattern.compile("^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%^&+=])"+"(?=\\S+$).{8,}$");
        return p.matcher(pwd).matches();
    }

}
