/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Nandini Kandi
 */
interface FatherInterface {

    public void myFather(); // interface method
}

interface MotherInterface {

    public void myMother(); // interface method
}

class DemoClass implements FatherInterface, MotherInterface {

    @Override
    public void myFather() {
        System.out.println("This is myFather()..");
    }

    @Override
    public void myMother() {
        System.out.println("This is myMother()..");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myFather();
        myObj.myMother();
    }
}
