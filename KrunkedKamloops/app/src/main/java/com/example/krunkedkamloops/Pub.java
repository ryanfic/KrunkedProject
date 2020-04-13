package com.example.krunkedkamloops;

import java.util.ArrayList;
import java.util.List;

public class Pub {

    private String pubName;
    private String location;

    private String sun_key;
    private String mon_key;
    private String tue_key;
    private String wed_key;
    private String thu_key;
    private String fri_key;
    private String sat_key;




    /*private List<Drink> mon = new ArrayList<Drink>();
    private List<Drink> tue = new ArrayList<Drink>();
    private List<Drink> wed = new ArrayList<Drink>();
    private List<Drink> thu = new ArrayList<Drink>();
    private List<Drink> fri = new ArrayList<Drink>();
    private List<Drink> sat = new ArrayList<Drink>();
    private List<Drink> sun = new ArrayList<Drink>();*/

    public Pub(String pubName, String location, String sun_key, String mon_key, String tue_key, String wed_key, String thu_key, String fri_key, String sat_key){
        this.pubName = pubName;
        this.location = location;

        this.sun_key = sun_key;
        this.mon_key = mon_key;
        this.tue_key = tue_key;
        this.wed_key = wed_key;
        this.thu_key = thu_key;
        this.fri_key = fri_key;
        this.sat_key = sat_key;
    }

    //getter
    /*public List<Drink> getMon(){
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
    }*/

    public String getName(){
        return pubName;
    }
    public String getLocation(){
        return location;
    }

    public String getSunKey(){
        return sun_key;
    }
    public String getMonKey(){
        return mon_key;
    }
    public String getTueKey(){
        return tue_key;
    }
    public String getWedKey(){
        return wed_key;
    }
    public String getThuKey(){
        return thu_key;
    }
    public String getFriKey(){
        return fri_key;
    }
    public String getSatKey(){
        return sat_key;
    }

    //setter
    public void setSunKey(String key){
        sun_key = key;
    }
    public void setMonKey(String key){
        mon_key = key;
    }
    public void setTueKey(String key){
        tue_key = key;
    }
    public void setWedKey(String key){
        wed_key = key;
    }
    public void setThuKey(String key){
        thu_key = key;
    }
    public void setFriKey(String key){
        fri_key = key;
    }
    public void setSatKey(String key){
        sat_key = key;
    }
    //add drink
    /*public void addMon(Drink drink){
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
    }*/


}
