/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nandini Kandi
 */
public class RemoveDuplicates {

    public static void removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i : list) {
            if (!temp.contains(i)) {
                temp.add(i);
            }
        }
        System.out.print("The distinct integers are ");
        
        for (int i : temp) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> input = new ArrayList<Integer>();
        ArrayList<Integer> output = new ArrayList<Integer>();

        System.out.print("Enter ten integers: ");
        
        for (int i = 1; i <= 10; i++) {
            input.add(scan.nextInt());
        }

        removeDuplicate(input);

    }

}
