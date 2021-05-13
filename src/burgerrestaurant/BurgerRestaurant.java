 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burgerrestaurant;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class BurgerRestaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Welcome to our Wonderful Restaurant XD");
        
//        Burger Tyoe
        System.out.println("Please enter your burger Type:\n"
                + "1- Normal\n"
                + "2- Healthy\n"
                + "3- Deluxe");
        int x = sc.nextInt();
        
        
//        Normal Burger
        if(x == 1){
//            defining the burger data meat, bread , additions
            int m, b, n;
            String meat, bread;
            System.out.println("Please enter your type of meat:\n"
                    + "0- beef\n"
                    + "1- Chicken");
            m = sc.nextInt();
            
            System.out.println("Please enter your type of bread:\n"
                    + "0- White \n"
                    + "1- Brown");
            b = sc.nextInt();

//          creating the burger object  
            Burger o = new Burger("Normal", Burger.meat[m], Burger.bread[b]);
            
            
//           numbers of additions
            do{
            System.out.println("Please enter your number of additions \"Make sure it is 4 Maximum\":");
            n = sc.nextInt();
            }while(n<0 || n>4);
            
//            Additions Menue
            System.out.println("Additions Menue:");
            for(int i=0; i< Burger.allAdditions.length; i++){
                System.out.println(i + "- " + Burger.allAdditions[i]);
            }
            
//            Input the Additions
            for(int j =0; j<n; j++){
                System.out.println("Please enter your addition (" +(j+1) + ") number:");
                int a = sc.nextInt();
                o.addAddition(Burger.allAdditions[a]);
            }
            
            System.out.println("Your order:");
            System.out.println(o);
            
//            Healthy Burger
        } else if(x == 2){
//            defining the burger data meat, bread , additions
            int m, n;
            String meat, bread;
            System.out.println("Please enter your type of meat:\n"
                    + "0- beef\n"
                    + "1- Chicken");
            m = sc.nextInt();
           

//          creating the burger object  
            HealthyBurger o = new HealthyBurger(Burger.meat[m]);
            
            
//           numbers of additions
            do{
            System.out.println("Please enter your number of additions \"Make sure it is 2 Maximum\":");
            n = sc.nextInt();
            }while(n<0 || n>2);
            
//            Additions Menue
            System.out.println("Additions Menue:");
            for(int i=0; i< Burger.allAdditions.length; i++){
                System.out.println(i + "- " + Burger.allAdditions[i]);
            }
            
//            Input the Additions
            for(int j =0; j<n; j++){
                System.out.println("Please enter your addition (" +(j+1) + ") number:");
                int a = sc.nextInt();
                o.addAddition(Burger.allAdditions[a]);
            }
            
            System.out.println("Your order:");
            System.out.println(o);
            
//            Deluxe Burger
        }else if(x == 3){
//         
//          creating the burger object  
            DeluxeBurger o = new DeluxeBurger();

//            Printing the order
            System.out.println("Your order:");
            System.out.println(o);
        }
        
        
        
    }
    
}
