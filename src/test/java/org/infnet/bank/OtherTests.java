package org.infnet.bank;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OtherTests {
    private BankAccount account;
    @BeforeEach
    void setUp(){
        Faker faker = new Faker();
        account = new BankAccount("Gloria","Leonardo", 100.0);
    }
    @Test
    public void testDeposit10(){
        account.deposit(10);
        assertEquals(110,account.getBalance());
    }
    @Test
    public void testDeposit20(){
        account.deposit(20);
        assertEquals(120,account.getBalance());
    }
    @Test
    public void testDeposit30(){
        account.deposit(30);
        assertEquals(130,account.getBalance());
    }

    @ParameterizedTest
    @ValueSource(doubles= {0.1,100.0})
    void testDepositVariousAmounts(double amount){
        BankAccount bankAccount = new BankAccount("Gloria", "Leonardo", 100.0);
        bankAccount.deposit(amount);
        assertEquals(100 + amount, bankAccount.getBalance());

    }



}
