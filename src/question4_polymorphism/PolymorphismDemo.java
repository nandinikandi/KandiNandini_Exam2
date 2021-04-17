/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4_polymorphism;

/**
 *
 * @author Nandini Kandi
 */
class Country {

    public void countrySays() {
        System.out.println("This is my Country!");
    }
}

class India extends Country {

    @Override
    public void countrySays() {
        System.out.println("India is my Country!");
    }
}

class USA extends Country {

    @Override
    public void countrySays() {
        System.out.println("USA is my Country!");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {
        Country myCountry = new Country();
        Country myIndia = new India();
        Country myUSA = new USA();

        myCountry.countrySays();
        myIndia.countrySays();
        myUSA.countrySays();
    }
}
