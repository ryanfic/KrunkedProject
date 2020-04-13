package com.example.krunkedkamloops;

import java.util.ArrayList;
import java.util.List;

public class Pub {

    private String pubName;
    private String location;

    private List<Drink> mon = new ArrayList<Drink>();
    private List<Drink> tue = new ArrayList<Drink>();
    private List<Drink> wed = new ArrayList<Drink>();
    private List<Drink> thu = new ArrayList<Drink>();
    private List<Drink> fri = new ArrayList<Drink>();
    private List<Drink> sat = new ArrayList<Drink>();
    private List<Drink> sun = new ArrayList<Drink>();

    public Pub(String pubName, String location){
        this.pubName = pubName;
        this.location = location;
    }

    //getter
    public List<Drink> getMon(){
        return mon;
    }
    public List<Drink> getTue(){
        return tue;
    }
    public List<Drink> getWed(){
        return wed;
    }
    public List<Drink> getThu(){
        return thu;
    }
    public List<Drink> getFir(){
        return fri;
    }
    public List<Drink> getSat(){
        return sat;
    }
    public List<Drink> getSun(){
        return sun;
    }

    public String getName(){
        return pubName;
    }
    public String getLocation(){
        return location;
    }

    //add drink
    public void addMon(Drink drink){
        mon.add(drink);
    }
    public void addTue(Drink drink){
        tue.add(drink);
    }
    public void addWed(Drink drink){
        wed.add(drink);
    }
    public void addThu(Drink drink){
        thu.add(drink);
    }
    public void addFri(Drink drink){
        fri.add(drink);
    }
    public void addSat(Drink drink){
        sat.add(drink);
    }
    public void addSun(Drink drink){
        sun.add(drink);
    }

    //remove Drinks
    public void removeMonDrink(Drink drink, String removeMe){
        if(drink.getDrinkName().equals(removeMe)){
            mon.remove(drink);
        }
    }
    public void removeTueDrink(Drink drink, String removeMe){
        if(drink.getDrinkName().equals(removeMe)){
            tue.remove(drink);
        }
    }
    public void removeWedDrink(Drink drink, String removeMe){
        if(drink.getDrinkName().equals(removeMe)){
            wed.remove(drink);
        }
    }
    public void removeThuDrink(Drink drink, String removeMe){
        if(drink.getDrinkName().equals(removeMe)){
            thu.remove(drink);
        }
    }
    public void removeFriDrink(Drink drink, String removeMe){
        if(drink.getDrinkName().equals(removeMe)){
            fri.remove(drink);
        }
    }
    public void removeSatDrink(Drink drink, String removeMe){
        if(drink.getDrinkName().equals(removeMe)){
            sat.remove(drink);
        }
    }
    public void removeSunDrink(Drink drink, String removeMe){
        if(drink.getDrinkName().equals(removeMe)){
            sun.remove(drink);
        }
    }


}
