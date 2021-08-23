import java.util.Scanner; // imports scanner

/**
 * A class representing the calcTotal of the pizza order
 *@author Katherine Monroy
 *@author Student ID: 2368029
 *@author kmonroy@chapman.edu
 *CPSC 231-02 - Stevens
 *Mastery Programming Project 2: More Classes
 *@version 1.0
 */

public class PizzaOrder {
  // declared private fields for the pizza order( pizza order attributes)
  /**
    * The number of pizzas in the pizza order
    */
  private int m_numPizzas; // pizzas in order
  /**
    * base array for each pizza order
    */
  private Pizza[] m_order; // base array for piza order
  /**
    * keeps track of pizzas in the array
    */
  private int pizzaIdexCount = 0; // used in the add() method to keep track of which index to add to

  /**
    * Default constructor initializing m_numPizzas to 1, and m_order's array to ("small", 1, 0, 0)
    */

  // Default constructor for pizza order
  public PizzaOrder(){
    m_numPizzas = 1;
    m_order = new Pizza[m_numPizzas];
    m_order[0] = new Pizza("small", 1, 0, 0); //calls method from Pizza.java
  }

  /** an Overloaded Constructor that takes an int numPizzas
  *@param numPizzas an int showing number of pizzas to be ordered and initializes that int to an empty
  *array of that size
  */

  // Overloaded constructor for pizza order
  public PizzaOrder(int numPizzas){
    m_numPizzas = numPizzas;
    m_order = new Pizza[m_numPizzas];
  }

  /**
      * Returns the number of pizzas in pizza order
      * @return an int value representing number of pizzas
      */

  // accessors (getters)
  public int getNumPizzas(){
    return m_numPizzas;
  }

  /**
      * Returns the pizza order
      * @return m_order
      */
  public Pizza[] getPizzaOrder(){
    return m_order;
  }

  /**
    * Returns weather you can add another pizza to the pizza order or not.
    * @param pizza pizza object from the pizza class
    * @return an int( 1 or -1) that keeps the order at the set/intial size. -1 when no more pizzas can be added and 1 if pizza was added
    */

  // mutator ( setter)
  // adds a new pizza to the existing order without violating the set size of the pizza order
  public int addPizza(Pizza pizza){
    // if statement compares the pizzas ordered to desired number of pizzas
    if(pizzaIdexCount > (m_numPizzas - 1)){
      System.out.println("Can't add another pizza to the order. We apolagize for the inconvienience.");
      return -1;
    }
    //adds the pizza object to pizza order array
    m_order[pizzaIdexCount] = pizza;
    // adds to count to make sure there is enough space for the next pizza potnetially added to order array
    pizzaIdexCount += 1;
    return 1;
  }

  /**
    * Returns the total cost of the pizza order
    * @return total cost --> a double value representing cost of the pizza for the pizza order
    */

  // calculates the total cost of the pizza order
  public double calcTotal(){
    double totalCost = 0;
    // iterates thru pizza PizzaOrder
    for(int i = 0; i < m_numPizzas; ++i){
      // adds each pizza total to the totalCost
      totalCost += m_order[i].calcCost();
    }
    return totalCost;
  }
  /**
      * returns a String representing each order, so that the employee at the pizza joint can repeat the order back to you before sending it to the kitchen and
      * calls calcTotal() so that the total price can be displayed
      * @return a String containing what you ordered, the cost, details of pizza, and the cost again
      */
  // prints out the pizza orders in an organized format
  public String toString(){
    String ciao = "You ordered " + m_numPizzas + " pizzas.\n";
    ciao += "The final cost of your order is: $" + this.calcTotal();
    ciao += "\nThe pizzas are the following: \n";
    for(int i = 0; i < m_numPizzas; ++i){
      ciao += m_order[i].toString(); //toString from pizza.java
    }
    ciao += "One more time... the total cost of your order is: $" + this.calcTotal()+"\n";
    ciao += "Thank you for your order! Come again soon!";
    return ciao; // ciao because haha italian pizza haha jokes haha
  }
}
