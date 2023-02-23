package com.example.homwork3_4;

import java.util.ArrayList;

public class Continents  extends Essence{
    private Integer square;
    private String image;
    private ArrayList<Country> listOfCountry;

    public Continents(String евразия, int i, String s, ArrayList<Country> evrasiaList) {
        super();
    }

    public void Continent(String name, Integer square, String image, ArrayList<Country> listOfCountry) {
        super(name);
        this.square = square;
        this.image = image;
        this.listOfCountry = listOfCountry;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ArrayList<Country> getListOfCountry() {
        return listOfCountry;
    }

    public void setListOfCountry(ArrayList<Country> listOfCountry) {
        this.listOfCountry = listOfCountry;
}
