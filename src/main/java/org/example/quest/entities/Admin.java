package org.example.quest.entities;

import org.example.quest.model.ListPlayers;

import java.util.List;

public class Admin {
    private String nameUser;
    private ListPlayers listPlayers;

    public Admin(String nameUser) {
        this.nameUser = nameUser;
        this.listPlayers = ListPlayers.getInstance();
    }

    public Player getPlayerAndAddList() {
        List<Player> players = listPlayers.getPlayers();
        Player newPlayer = new Player(nameUser);
        if (players.isEmpty() || !players.contains(newPlayer)) {
            players.add(newPlayer);
        } else {
            for (Player player : players) {
                if (player.equals(newPlayer))
                    return player;
            }
        }
        return newPlayer;
    }

    public ListPlayers getListPlayers() {
        return listPlayers;
    }
}
