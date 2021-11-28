package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void getFriendsAlexTest() throws Exception{
        Alex alex = new Alex(feline);
        List<String> actual = alex.getFriends();
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, actual);
    }


    @Test
    public void getPlaceOfLivingAlexTest() throws Exception{
        Alex alex = new Alex(feline);
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensAlexTest() throws Exception{
        Alex alex = new Alex(feline);
        int actual = alex.getKittens();
        int expected = 0;
        assertEquals(expected, actual);
    }

}
