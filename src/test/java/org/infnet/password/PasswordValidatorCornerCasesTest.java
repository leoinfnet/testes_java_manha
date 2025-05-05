package org.infnet.password;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class PasswordValidatorCornerCasesTest {
    private PasswordValidator passwordValidator;
    @BeforeEach
    void setUp(){
        passwordValidator = new PasswordValidator();
    }
    @Test void testNullPassword(){
        assertFalse(passwordValidator.isValid(null));
    }
    @Test
    void testEmptyPassword(){ assertFalse(passwordValidator.isValid(""));}
    @Test
    void testWhitespacesOnlye(){ assertFalse(passwordValidator.isValid("          "));}
    @Test
    void testExactlyEightCharsButInvalid(){assertFalse(passwordValidator.isValid("Sen@12"));}
    @Test
    void testLongPasswordWithoutRequirements(){
        String pwd = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        assertFalse(passwordValidator.isValid(pwd));
    }



}
