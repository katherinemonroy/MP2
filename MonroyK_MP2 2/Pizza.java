/**
 * A class representing the attributes of a pizza such as size, cheeseToppings, pepperoniToppings, and veggieToppings.
 * and a way to calculate the cost of the pizza taking into account its above attributes
 *@author Katherine Monroy
 *@author Student ID: 2368029
 *@author kmonroy@chapman.edu
 *CPSC 231-02 - Stevens
 *Mastery Programming Project 2: More Classes
 *@version 1.0
*/

import java.util.Scanner;

public class Pizza {
  /**
    * The size of the pizza
    */

  // declared private fields for pizza ( pizza attributes)
  private String m_size;
  /**
    * The amount of cheese toppings
    */
  private int m_cheeseToppings;
  /**
    * The amount of peperoni toppings
    */
  private int m_pepperoniToppings;
  /**
    * The amount of veggie toppings
    */
  private int m_veggieToppings;


  /**
   * Default constructor initializing the size field to small, cheeseToppings field to 1, and pepperoniToppings and veggieToppings fields to 0
   */
  // default constructor for pizzzaaa
  public Pizza(){
    m_size = "small";
    m_cheeseToppings = 1;
    m_pepperoniToppings = 0;
    m_veggieToppings = 0;
  }
  /**
    * Constructor initializing m_size to size and
    * m_cheeseToppings to cheeseToppings and
    * m_pepperoniToppings to pepperoniToppings and
    * m_veggieToppings to veggieToppings.
    * @param size of the pizza
    * @param cheeseToppings amount of cheese on the pizza
    * @param pepperoniToppings amount of pepperoni on the pizza
    * @param veggieToppings amount of veggies on the pizza
    */
  // overloaded constructor with the private fields as params for each pizza
  public Pizza(String size, int cheeseToppings, int pepperoniToppings, int veggieToppings){
    m_size = size;
    m_cheeseToppings = cheeseToppings;
    m_pepperoniToppings = pepperoniToppings;
    m_veggieToppings = veggieToppings;
  }
  //TO DO: ADD JAVADOC COMMENTS HERE

  /**
    * Copy constructor
    * @param og copies for member variables
    */
  // Copy constructor
  public Pizza(Pizza og){
    this.m_size = og.m_size;
    this.m_cheeseToppings = og.m_cheeseToppings;
    this.m_pepperoniToppings = og.m_pepperoniToppings;
    this.m_veggieToppings = og.m_veggieToppings;
  }

  /**
    * Returns the size of the Pizza.
    * @return a string value representing the size of the pizza.
    */

  // accessors (getters)
  public String getSize(){
    return m_size;
  }
  /**
    * Returns the total amount of cheeseToppings.
    * @return an int value representing the amount of cheeseToppings.
    */
  public int getCheeseToppings(){
    return m_cheeseToppings;
  }
  /**
    * Returns the total amount of pepperoniToppings.
    * @return an int value representing the amount of pepperoniToppings.
    */
  public int getPepperoniToppings(){
    return m_pepperoniToppings;
  }
  /**
    * Returns the total amount of veggieToppings.
    * @return an int value representing the amount of veggieToppings.
    */
  public int getVeggieToppings(){
    return m_veggieToppings;
  }

  /**
   * Sets the m_size to size.
   * @param size of the pizza
  */

  // mutators (setters)
  public void setSize(String size){
    m_size = size;
  }
  /**
   * Sets the m_cheeseToppings to cheeseToppings.
   * @param cheeseToppings amount of cheese on the pizza
  */
  public void setCheeseToppings(int cheeseToppings){
    m_cheeseToppings = cheeseToppings;
  }
  /**
   * Sets the m_pepperoniToppings to pepperoniToppings.
   * @param pepperoniToppings amount of pepperoni on the pizza
  */
  public void setPepperoniToppings(int pepperoniToppings){
    m_pepperoniToppings = pepperoniToppings;
  }
  /**
   * Sets the m_veggieToppings to veggieToppings.
   * @param veggieToppings amount of veggies on the pizza
  */
  public void setVeggieToppings(int veggieToppings){
    m_veggieToppings = veggieToppings;
  }


  /**
   * returns the cost of the pizza based on its size.
   * @return an in representing totalCost
   */
  public double calcCost(){
    // calculates the totalCost
    double totalCost = 0.0;
    int numberOfToppings = 0;

    // adds cost of size based on its size
    switch(this.m_size){
      case "small":
      case "Small":
        totalCost += 10;
        break;
      case "medium":
      case "Medium":
        totalCost += 12;
        break;
      case "large":
      case "Large":
        totalCost += 14;
        break;
    }

  // calls accessors to get the toppings for each pizza
  numberOfToppings = this.getCheeseToppings() + this.getPepperoniToppings() + this.getVeggieToppings();
  totalCost += (2 * numberOfToppings); // each topping costs $2
  return totalCost;
  }
  /**
      * returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost().
      * @return that returns a String containing all important info about pizza and its cost
      */
  public String toString(){
    String pizzaString = "";
    pizzaString += "Size: " + this.getSize();
    pizzaString += "\nNumber of Cheese Toppings: " + this.getCheeseToppings();
    pizzaString += "\nNumber of Pepperoni Toppings: " + this.getPepperoniToppings();
    pizzaString += "\nNumber of Veggie Toppings: " + this.getVeggieToppings();
    pizzaString += "\nPizza Cost: $" + this.calcCost();
    pizzaString += "\n";
    return pizzaString;
  }
}
