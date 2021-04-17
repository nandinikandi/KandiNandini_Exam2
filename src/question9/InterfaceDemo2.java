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
interface ActorInterface {

    public void myActor(); // interface method
}

interface DirectorInterface {

    public void myDirector(); // interface method
}

class MovieClass implements ActorInterface, DirectorInterface {

    @Override
    public void myActor() {
        System.out.println("Hero is Ranveer Singh..");
    }

    @Override
    public void myDirector() {
        System.out.println("Director is Karan Johar..");
    }
}

public class InterfaceDemo2 {

    public static void main(String[] args) {
        MovieClass myObj = new MovieClass();
        myObj.myActor();
        myObj.myDirector();
    }
}
