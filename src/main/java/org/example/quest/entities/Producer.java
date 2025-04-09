package org.example.quest.entities;

import org.apache.commons.lang3.StringUtils;
import org.example.quest.model.ModelScenario;
import org.example.quest.model.ScenarioOne;

import java.util.HashMap;

public class Producer {
    private String questNumber;
    private ModelScenario scenario;

    public Producer(String questNumber) {
        this.questNumber = questNumber;
        this.scenario = initScenario();
    }

    private ModelScenario initScenario() {
        return switch (this.questNumber) {
            case "one" -> new ScenarioOne();
            default -> null;
        };
    }

    public HashMap<String,String> startQuest(String parameterAnswer, Player player, Level level) {
        HashMap<String, String> result = new HashMap<>();
        result.put("prolog", scenario.getProlog());
        if(StringUtils.equals(parameterAnswer, "res") || StringUtils.equals(parameterAnswer,"menu")){
            player.setNumberOfGameOne(player.getNumberOfGameOne() + 1);
        }
        if (level.getLevel() < scenario.getLevel()) {
            if (StringUtils.isEmpty(parameterAnswer) || StringUtils.equals(parameterAnswer, "pos") || StringUtils.equals(parameterAnswer, "res")) {
                result.put("question", scenario.getQuestions().get(level.getLevel()+""));
                result.put("positiveAnswer", scenario.getPositiveAnswers().get(level.getLevel() + ".1"));
                result.put("negativeAnswer", scenario.getNegativeAnswers().get(level.getLevel() + ".2"));
            }
        }
        if(level.getLevel() == scenario.getLevel()) {
            result.put("win",scenario.getPositiveAnswers().get(level.getLevel() +".1"));
        }
        if(StringUtils.equals(parameterAnswer, "neg")){
            result.put("lost", scenario.getNegativeAnswers().get(level.getLevel()+".2.1"));
        }
        return result;
    }
}
