/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Nandini Kandi
 *
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Object> arrayList = new ArrayList<Object>();

        Loan loan = new Loan(10000, 25, 1);
        arrayList.add(loan);

        Date date = new Date();
        arrayList.add(date);

        String name = "Nandini";
        arrayList.add(name);

        Circle circle = new Circle(10);
        arrayList.add(circle);

        for (Object obj : arrayList) {
            if (obj.getClass() == String.class) {
                System.out.println("String Name: " + obj.toString());
            }
            if (obj.getClass() == Loan.class) {
                System.out.println("Loan Object toString():\n" + obj.toString());
            }
            if (obj.getClass() == Circle.class) {
                System.out.println("Circle Object toString():\n" + obj.toString());
            }
            if (obj.getClass() == Date.class) {
                System.out.println("Date Object toString(): " + obj.toString());
            }
            System.out.println();
        }

    }

}
