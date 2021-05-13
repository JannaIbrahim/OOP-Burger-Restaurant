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
public class DeluxeBurger extends Burger{
    
    public DeluxeBurger() {
        super("Deluxe", Burger.meat[0], Burger.bread[0]);
        this.addAddition(Burger.allAdditions[5]);
        this.addAddition(Burger.allAdditions[4]);
    }
    
   
    
}
