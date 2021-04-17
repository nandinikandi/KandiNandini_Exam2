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
class Earth extends Planets {

    private String mysatellite = "MOON is Earth's satellite";    

    public static void main(String[] args) {

        Earth myEarth = new Earth();

        myEarth.satellite();
        System.out.println(myEarth.star + "\n" + myEarth.mysatellite);
    }

}
