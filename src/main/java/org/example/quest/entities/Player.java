package org.example.quest.entities;

import java.util.Objects;

public class Player {
    private String name;
    private int numberOfGameOne;

    public Player(String name) {
        this.name = name;
        this.numberOfGameOne = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfGameOne() {
        return numberOfGameOne;
    }

    public void setNumberOfGameOne(int numberOfGameOne) {
        this.numberOfGameOne = numberOfGameOne;
    }

    @Override
    public String toString() {
        return "Игрок :" + name + " Количество попыток Квест 1 : " + numberOfGameOne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
