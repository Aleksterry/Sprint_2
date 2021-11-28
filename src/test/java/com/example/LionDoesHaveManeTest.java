package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {

    private final String animalSex;
    private final boolean expected;

    public LionDoesHaveManeTest(String animalSex, boolean expected) {
        this.animalSex = animalSex;
        this.expected = expected;
    }

    @Mock
    Feline feline;


    @Parameterized.Parameters
    public static Object[][] getSexData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }


    @Test
    public void doesHaveManeLionTest() throws Exception{
        Lion lion = new Lion(animalSex,feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);

    }

    @Test
    public void doesHaveManeLionExceptionTest() throws Exception{
        try {
            Lion lion = new Lion("Не определившийся",feline);
            lion.doesHaveMane();
        } catch (Exception e) {
        assertTrue(e.getMessage().equals("Используйте допустимые значения пола животного - самец или самка"));
    }
    }

}
