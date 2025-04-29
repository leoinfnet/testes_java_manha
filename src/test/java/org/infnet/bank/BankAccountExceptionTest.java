package org.infnet.bank;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountExceptionTest {
    private BankAccount account;
    @BeforeEach
    void setUp(){
        Faker faker = new Faker();
        account = new BankAccount("Gloria","Leonardo",
                100.0);
    }
    @Test
    void testCreateAcountWithNegativeBalance(){
        assertThrows(IllegalArgumentException.class, () -> {
            new BankAccount("Joao", "Da Silva", -100.23);
        });
    }
    @Test
    void testDepositNegativeAmount(){
        assertThrows(IllegalArgumentException.class, () ->{
            account.deposit(-30);
        });
    }
    @Test
    void testDepositZero(){
        assertThrows(IllegalArgumentException.class, () ->{
            account.deposit(-0);
        });
    }

}
