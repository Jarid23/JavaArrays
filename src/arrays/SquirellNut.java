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
import java.util.Random;

public class SquirellNut {

    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");
        int nutLocation = 0;
        
        while (nutLocation < hidingSpots.length) {
        if (hidingSpots[nutLocation] != null) {
        System.out.println("Found it! It's in spot# " + nutLocation);
    }
    nutLocation++;
}}}
