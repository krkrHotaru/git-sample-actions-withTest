package com.example.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testPower1(){
        double assumedAnswer = MathUtil.power(0,-1);
        assertEquals(Double.POSITIVE_INFINITY,assumedAnswer,"TC2:想定の結果と異なります");
    }

    @Test
    void testPower2(){
        double assumedAnswer = MathUtil.power(0,0);
        assertEquals(1.0,assumedAnswer,"TC3:想定の結果と異なります");
    }

    @Test
    void testPower3(){
        double assumedAnswer = MathUtil.power(0,1);
        assertEquals(0.0,assumedAnswer,"TC4:想定の結果と異なります");
    }
}