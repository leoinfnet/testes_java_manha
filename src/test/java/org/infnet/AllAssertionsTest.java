package org.infnet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AllAssertionsTest {
    @Test
    void testEquality(){
        assertEquals(10,5+5);
        assertNotEquals(10,5*3);
    }
    @Test
    void testBooleanConditions() {
        assertTrue( 3 < 5);
        assertFalse(10 < 5);
    }
    @Test
    void testNullChecks() {
        String s  = null;
        String nome = "Leonardo";
        assertNull(s);
        assertNotNull(nome);
    }
    @Test
    void testObjectIdentity() {
        String a = "hello";
        String b = a;
        String c = new String("hello");
        assertSame(a,b);
        assertNotSame(a,c);
    }
    @Test
    void testGroupedAssertions() {
        int result = 42;
        assertAll("Grouped Assertions",
            () -> assertTrue(result > 0),
            () -> assertEquals(42,result),
            () -> assertNotEquals(0, result)
        );
    }
    @Test
    void testExceptionExpected() {
        List<Object> lista = new ArrayList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            lista.get(0);
        });
    }
    @Test
    void testNoExceptionExpected() {
        assertDoesNotThrow(() ->{
            List<String> nomes = new ArrayList<>();
            nomes.add("Leo");
        });
    }

    @Test
    void testForceFailure() {
        int status = 404;
        if(status != 200){
          //  fail("Expected status 200 but got " + status); força uma falha
        }
    }
}
