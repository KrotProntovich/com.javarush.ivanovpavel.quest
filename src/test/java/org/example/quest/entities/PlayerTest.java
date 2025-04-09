package org.example.quest.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        Player testPlayer = new Player("Jon");
        assertEquals("Jon", testPlayer.getName());
    }

    @Test
    void getNumberOfGameOne() {
        Player testPlayer = new Player("Jon");
        assertEquals(0, testPlayer.getNumberOfGameOne());
    }

    @Test
    void setNumberOfGameOne() {
        Player testPlayer = new Player("Jon");
        testPlayer.setNumberOfGameOne(1);
        assertEquals(1, testPlayer.getNumberOfGameOne());
    }

    @Test
    void testEquals() {
        Player testPlayer1 = new Player("Jon");
        Player testPlayer2 = new Player("Bob");
        Player testPlayer3 = new Player("Jon");
        assertFalse(testPlayer1.equals(testPlayer2));
        assertTrue(testPlayer1.equals(testPlayer3));
    }
}