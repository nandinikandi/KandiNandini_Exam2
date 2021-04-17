/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Nandini Kandi
 */
//Abstract class
abstract class Movie {
// Abstract method (does not have a body)

    public abstract void movielanguage();
// Regular method

    public void play() {
        System.out.println("Movie is playing..");
    }
}

//Subclass (inherit from Movie)
class TeluguMovie extends Movie {

    @Override
    public void movielanguage() {
        // The body of movielanguage() is provided here
        System.out.println("This is a Telugu Movie..");
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {
        TeluguMovie myTeluguMovie = new TeluguMovie(); // Create a TeluguMovie object
        myTeluguMovie.movielanguage();
        myTeluguMovie.play();
    }
}
