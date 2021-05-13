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
public class HealthyBurger extends Burger {
    
    public HealthyBurger(String meatType) {
        super("Healthy", meatType, Burger.bread[1]);
    }
    
    private String[] additions = new String[2];
    
}
