package com.nt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    @Test
    public void testSumWithPositiveValues() {
    	App a = new App();
    	int x = 100;
    	int y = 200;
    	int expected = 300;
    	int actual = a.sum(x, y);
    	assertEquals(expected, actual);
    }
}
