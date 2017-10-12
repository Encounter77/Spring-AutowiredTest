package com.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KnightImpl implements Knight {
    @Value("${knightname}")
    private String knightName;
    @Autowired
    private Quest quest;

    public KnightImpl() {
    }

    public KnightImpl(String knightName, Quest quest) {
        this.knightName = knightName;
        this.quest = quest;
    }

    public String getKnightName() {
        return knightName;
    }

    public void setKnightName(String knightName) {
        this.knightName = knightName;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void workInfo() {
        quest.questinfo();
    }

    @Override
    public void info() {
        System.out.print("my name is "+knightName);
    }
}
