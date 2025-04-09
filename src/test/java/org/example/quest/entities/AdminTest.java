package org.example.quest.entities;

import org.example.quest.model.ListPlayers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {

    @Test
    void getPlayerAndAddList() {
        ListPlayers listPlayers = ListPlayers.getInstance();
        Player player = new Player("Jon");
        listPlayers.getPlayers().add(player);
        Admin admin = new Admin("Jon");
        Player playerAndAddList = admin.getPlayerAndAddList();
        assertSame(player, playerAndAddList);
        assertSame(listPlayers, admin.getListPlayers());

    }

    @Test
    void getListPlayers() {
        ListPlayers listPlayers = ListPlayers.getInstance();
        Admin admin = new Admin("Jon");
        assertSame(listPlayers, admin.getListPlayers());
        listPlayers.getPlayers().add(new Player("Bob"));
        assertSame(listPlayers, admin.getListPlayers());
    }
}