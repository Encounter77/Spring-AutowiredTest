package com.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class QuestImpl implements Quest {
    @Value("${workaddress}")
    private String address;
    @Value("${worktime}")
    private double time;

    public QuestImpl() {
    }

    public QuestImpl(String address, double time) {
        this.address = address;
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public void questinfo() {
        System.out.print(" 任务地点："+address+",任务时间："+time);
    }
}
