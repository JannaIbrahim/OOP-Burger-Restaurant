/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgerrestaurant;

/**
 *
 * @author Hp
 */
public class Burger {
    
//    Class Data
    protected String name;
    protected String meatType;
    protected String breadType;
    protected double price;
    protected String[] additions = new String[4];
    protected int additionsNum = 0;
    
    
//    Aditions
   public static final String[] allAdditions = {"Cheese","Onion","Tomato","Lettuce","Drink","Chips","Fries","Mushroom","Eggs","Jalapeno"};
   
   public static final String[] meat = {"Beef", "Chicken"};
   
   public static final String[] bread = {"White", "Brown"};
    
    
//    Constructors

    public Burger(String name, String meatType, String breadType) {
        this.name = name;
        this.meatType = meatType;
        this.breadType = breadType;
        this.price = 40;
    }

//    Getters
    public String getName() {
        return name;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getBreadType() {
        return breadType;
    }

    public double getPrice() {
        return price;
    }
    
    public String getAdditions(){
        String s = "";
        for(int i= 0; i<additionsNum; i++){
            s += (i+1) + "- " + additions[i]+"\n";
        }
        return s;
    }

    
//    Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }
    
    public void addAddition(String addition){
        this.additions[additionsNum] = addition;
        additionsNum++; 
        addPrice(addition);
        
    }

    @Override
    public String toString() {
        return "Burger:\n"
                +"Name:" + name + "\n"
                +"Meat Type: " + meatType +"\n"
                +"Bread Type: " + breadType +"\n"
                +"Price: " + price +"\n"
                +"Additions:\n"
                + this.getAdditions();
    }
    
    
    
    
//    Aditional methodes
    public void addPrice(String addition){
    
        switch(addition){
        
            case "Cheese":
                this.price += 5;
                break;
            case "Onion":
                this.price += 2;
                break;
            case "Tomato":
                this.price += 2;
                break;
            case "Lettuce":
                this.price += 2;
                break;
            case "Drink":
                this.price += 5;
                break;
            case "Chips":
                this.price += 15;
                break;
            case "Fries":
                this.price += 15;
                break;
            case "Mushroom":
                this.price += 3;
                break;
            case "Eggs":
                this.price += 4;
                break;
            case "Jalapeno":
                this.price += 3;
                break;
            
           
        }
            
    }

    
    
    
}
