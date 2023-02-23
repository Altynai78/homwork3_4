package com.example.homwork3_4;

public class Country  extends Essence{
    private Integer population;
    private String flag;

    public Country(String name, Integer population, String flag) {
        super(name);
        this.population = population;
        this.flag = flag;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
