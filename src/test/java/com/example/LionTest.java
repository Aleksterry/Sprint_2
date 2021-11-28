package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    Feline feline;


    @Test
    public void getKittensLionTest() throws Exception{
        Lion lion = new Lion("Самец",feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void getFoodLionTest() throws Exception{
        Lion lion = new Lion("Самка",feline);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Трава", "Различные растения"));
        List<String> actual = lion.getFood();
        List<String> expected = List.of("Трава", "Различные растения");
        assertEquals(expected, actual);
    }

}
