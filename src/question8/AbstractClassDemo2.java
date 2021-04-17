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
abstract class Artist {
    // Abstract method (does not have a body)

    public abstract void getJob();

    // Regular method
    public void work() {
        System.out.println("Artist is working..");
    }
}

// Subclass (inherit from Artist)
class Singer extends Artist {

    @Override
    public void getJob() {
        // The body of getJob() is provided here
        System.out.println("Singing a song..");
    }
}

class Actor extends Artist {

    @Override
    public void getJob() {
        // The body of getJob() is provided here
        System.out.println("Acting in a movie..");
    }
}

public class AbstractClassDemo2 {

    public static void main(String[] args) {
        Singer mySinger = new Singer(); // Create a Singer object
        mySinger.work();
        mySinger.getJob();

        Actor myActor = new Actor(); // Create a Singer object
        myActor.work();
        myActor.getJob();

    }
}
