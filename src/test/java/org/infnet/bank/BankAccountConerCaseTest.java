package org.infnet.bank;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountConerCaseTest {
    private BankAccount account;
    @BeforeEach
    void setUp(){
        Faker faker = new Faker();
        account = new BankAccount("Gloria","Leonardo",
                100.0);
    }
    @Test
    void testDepositMinimumPositiveAmount(){
        account.deposit(0.01);
        assertEquals(100.01,account.getBalance());
    }
    @Test
    void testWithdrawExactBalance(){
        account.withdraw(100.0);
        assertEquals(0.0,account.getBalance());
    }


}
