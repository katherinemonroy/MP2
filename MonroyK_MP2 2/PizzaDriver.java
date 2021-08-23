/**
 * This program calculates makes three different pizzas while adding different variations to it.
 *This class contains the program's main() method and is not meant to be instantiated.
 *@author Katherine Monroy
 *@author Student ID: 2368029
 *@author kmonroy@chapman.edu
 *CPSC 231-02 - Stevens
 *Mastery Programming Project 2: More Classes
 *@version 1.0
 */
public class PizzaDriver {



  /**
     * this PizzaDriverclass will serve as adriver class to your Pizzaand PizzaOrderclasses.
     * @param args command-line arguments
     * @see PizzaOrder#calcTotal()
     */
  public static void main(String[] args){

    Pizza pizza1 = new Pizza("small", 1, 0, 1); // creates a small pizza, 1 cheese, 1 veggie
    Pizza pizza2 = new Pizza("medium", 2, 2, 0); // creates a medium pizza, 2 cheese, 2 pepperoni
    Pizza pizza3 = new Pizza("large", 2, 0, 0); // creates a large pizza, 2 cheese
    PizzaOrder order = new PizzaOrder(2); // creates an order of 2 pizzas
    System.out.println(order.addPizza(pizza1)); // adds pizza1 to the pizza order
    System.out.println(order.addPizza(pizza2)); // adds pizza2 to the pizza order
    System.out.println(order.addPizza(pizza3)); // adds pizza3 to the pizza order
    System.out.println(order.toString()); // displays everything in a beautiful string
  }

}
