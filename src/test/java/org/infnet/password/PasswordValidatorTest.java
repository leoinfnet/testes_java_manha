package org.infnet.password;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidatorTest {
    private final PasswordValidator passwordValidator = new PasswordValidator();
    @Test
    void testPasswordValidation(){
        String pass1 = "Senha1234@";
        String pass2 = "Senha1234#";
        String pass3 = "Senha1234##";

    }
    @ParameterizedTest(name="Password \"{0}\" precisa ser {1}")
    @CsvSource({
            "Senha1234@,true",
            "Senha1234#,true",
            "Senha1234@#,true",
            "senha1234,false",
            "senhaFraca,false",
            "senha,false",
            "123456789,false",
            "Senha123,false",
    })
    void testPassValidation(String password, boolean expected){
        System.out.println(password);
        System.out.println(expected);
        assertEquals(expected, passwordValidator.isValid(password));
    }

}
