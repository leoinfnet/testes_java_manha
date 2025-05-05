package org.infnet.password;

public class PasswordValidator {
    public boolean isValid(String password){
        if(password == null) return false;
        if(password.length() < 8) return false;
        if(!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*[0-9].*")) return false;

       // if (!password.contains("@") || !password.contains("#")) return false;
        //SEnha@# F                                  F False False -
        if (!password.contains("@") && !password.contains("#")) return false;
        return true;

    }
}
