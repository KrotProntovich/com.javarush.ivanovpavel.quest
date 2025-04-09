package org.example.quest.entities;

import org.example.quest.model.ModelScenario;
import org.example.quest.model.ScenarioOne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
class ProducerTest {
private Level level = Mockito.mock(Level.class);
private Player player = Mockito.mock(Player.class);
private String parameter;
private ModelScenario scenario = new ScenarioOne();

   @Test
    void startQuest() {
        int l = 1;
        Mockito.when(level.getLevel()).thenReturn(l);
        parameter = null;
        Producer producer = new Producer("one");
        HashMap<String, String> result = producer.startQuest(parameter, player, level);
        assertAll(
                ()->assertEquals(result.get("question"), scenario.getQuestions().get(l+"")),
                ()->assertEquals(result.get("positiveAnswer"), scenario.getPositiveAnswers().get(l+".1")),
                ()->assertEquals(result.get("negativeAnswer"), scenario.getNegativeAnswers().get(l+".2"))
        );
    }

}