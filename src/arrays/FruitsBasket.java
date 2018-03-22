/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Jarid
 */
public class FruitsBasket {
    public static void main(String[] args) {
        String[] fruit = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple", "Apple", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};

        int OrangeCounter =0;
        int AppleCounter =0;
        int TotalFruit =0; 
        
        for (int i = 0; i < fruit.length; i++) {
    if(fruit[i] == "Apple")
    {
        AppleCounter++;
        TotalFruit++;
    }
    else{
    
        OrangeCounter++;
        TotalFruit++;
    }
    
}
    System.out.println("There are this many Oranges : " + OrangeCounter);
    System.out.println("There are this many Apples : " + AppleCounter);
    System.out.println("There are this many Total Fruit : " + TotalFruit);
    }}

    

