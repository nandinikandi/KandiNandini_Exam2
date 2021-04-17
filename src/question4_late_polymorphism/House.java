/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4_late_polymorphism;

/**
 *
 * @author Nandini Kandi
 */
class Building {

    void build() {
        System.out.println("Building is building...");
    }
}

public class House extends Building {

    @Override
    void build() {
        System.out.println("House is building...");
    }

    public static void main(String args[]) {
        Building a = new House();
        a.build();
    }
}
