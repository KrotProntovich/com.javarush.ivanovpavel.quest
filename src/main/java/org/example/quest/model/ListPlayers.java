package org.example.quest.model;

import org.example.quest.entities.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListPlayers {
    private static ListPlayers instance = new ListPlayers();
    private List<Player> players;

    public static ListPlayers getInstance() {
        return instance;
    }

    private ListPlayers() {
        players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }
}
