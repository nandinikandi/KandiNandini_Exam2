/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Nandini Kandi
 */
public class Saturn extends Planets {

    private String mysatellite = "Titan is Saturn's satellite";

    public static void main(String[] args) {

        Saturn mySaturn = new Saturn();

        mySaturn.satellite();
        System.out.println(mySaturn.star + "\n" + mySaturn.mysatellite);
    }
}
