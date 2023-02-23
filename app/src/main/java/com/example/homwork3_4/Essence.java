package com.example.homwork3_4;

import java.io.Serializable;

public abstract class Essence implements Serializable {
    private String name;

    public Essence(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
}
