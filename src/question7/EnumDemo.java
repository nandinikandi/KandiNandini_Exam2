/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Nandini Kandi
 */
public class EnumDemo {
	Directions dir;

	public EnumDemo(Directions dir) {
		this.dir = dir;
	}

	public void getMyDirection() {
		switch (dir) {
		case LEFT:
			System.out.println("Go LEFT");
			break;

		case RIGHT:
			System.out.println("Go RIGHT");
			break;

		case FRONT:
			System.out.println("Go FRONT");
			break;

		case BACK:
			System.out.println("Go BACK");
			break;

		default:
			System.out.println("Reached Home");
			break;
		}
	}

	public static void main(String[] args) {
		EnumDemo obj1 = new EnumDemo(Directions.RIGHT);
		obj1.getMyDirection();
		EnumDemo obj2 = new EnumDemo(Directions.LEFT);
		obj2.getMyDirection();
	}
}
