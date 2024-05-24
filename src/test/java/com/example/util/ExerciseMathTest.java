package com.example.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExerciseMathTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() throws Exception{
    }

    @Test
    void testPower1(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> ExerciseMath.factional(-1));
        assertEquals("「渡された値が正しくありません」",expectedException.getMessage(),"TC1:想定の結果と異なります");
    }

    @Test
    void testPower2(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                ()-> ExerciseMath.factional(0));
        assertEquals("「渡された値が正しくありません」",expectedException.getMessage(),"TC2:想定の結果と異なります");
    }

    @Test
    void testPower3(){
        int assumedAnswer = ExerciseMath.factional(1);
        assertEquals(1,assumedAnswer,"TC3:想定の結果と異なります");
    }

    @Test
    void testPower4(){
        int assumedAnswer = ExerciseMath.factional(5);
        assertEquals(120,assumedAnswer,"TC4:想定の結果と異なります");
    }

    @Test
    void testPower5(){
        int assumedAnswer = ExerciseMath.factional(12);
        assertEquals(479001600,assumedAnswer,"TC5:想定の結果と異なります");
    }

    @Test
    void testPower6(){
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> ExerciseMath.factional(13));
        assertEquals("規格を超える桁数の入力が行われました",expectedException.getMessage(),"TC5:想定の結果と異なります");
    }
}