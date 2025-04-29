package org.infnet.bank;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountHappyPathTest {
    private BankAccount account;
    @BeforeEach
    void setUp(){
        Faker faker = new Faker();
        account = new BankAccount("Gloria","Leonardo", 100.0);
    }
    @Test
    void testDepositPositiveAmount(){
        account.deposit(50.0);
        assertEquals(150.0,account.getBalance());
    }
    @Test
    void testWithdrawValidAmount(){
        account.withdraw(30.0);
        assertEquals(70.0,account.getBalance());
    }
    @Test
    void testGetOwner(){
        assertEquals("Leonardo Gloria",account.getOwner());
    }
}
