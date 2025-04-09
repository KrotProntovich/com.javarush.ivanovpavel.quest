package org.example.quest.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelTest {

    @Test
    void getLevel() {
        Level testLevel = new Level(2);
        assertEquals(testLevel.getLevel(), 2);
    }

    @Test
    void setLevel() {
        Level testLevel = new Level(3);
        testLevel.setLevel(1);
        assertEquals(testLevel.getLevel(), 1);
    }
}