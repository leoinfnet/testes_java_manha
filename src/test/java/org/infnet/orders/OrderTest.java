package org.infnet.orders;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    private Product laptop, book;

    @BeforeEach
    void setUp(){
        laptop = new Product("Notebook Dell",1000);
        book = new Product("Design Patterns", 100);
    }
    //VIP = 15%
    // > 500 =  10%

    @ParameterizedTest
    @CsvSource({
            "true,1,0,150.0", // VIP,1 Laptop = 1000 * 0.15 =150
            "false,1,0,100.0", // Regular, 1 laptop = 1000 * 0.10 - 100
            "false,0,2,0.0" // Regular, 2 livros 200 < 500 => Sem desconto
    })
    void testApplyDiscount(String vipFlag, int laptops,int books,double expectedDiscount){
        Customer cliente = new Customer("Cliente", Boolean.parseBoolean(vipFlag));
        Order order = new Order(cliente);
        for(int i=0;i<laptops;i++) order.addItem(new OrderItem(laptop,1));
        for(int i=0;i<books;i++) order.addItem(new OrderItem(book,1));
        order.applyDiscount();
        assertEquals(expectedDiscount,order.getDiscount(),0.01);
    }
}
