/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Nandini Kandi
 */
import java.util.Scanner;

public class TriangleDriver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter three sides of the triangle: ");
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();

        System.out.print("Please enter a color: ");
        String color = scan.next();

        System.out.print("Is the triangle filled ? Please enter true or false: ");
        boolean filled = scan.nextBoolean();

        Triangle triangle = new Triangle(color, filled, side1, side2, side3);

        System.out.println(triangle);
        scan.close();

    }
}
