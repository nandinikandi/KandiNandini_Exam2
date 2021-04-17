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
public class EnumDemo2 {
	Gender gender;

	public EnumDemo2(Gender gender) {
		this.gender = gender;
	}

	public void getMyGender() {
		switch (gender) {
		case MALE:
			System.out.println("This is MALE");
			break;

		case FEMALE:
			System.out.println("This is FEMALE");
			break;

		default:
			System.out.println("Not Applicable");
			break;
		}
	}

	public static void main(String[] args) {
		EnumDemo2 obj1 = new EnumDemo2(Gender.MALE);
		obj1.getMyGender();
		EnumDemo2 obj2 = new EnumDemo2(Gender.FEMALE);
		obj2.getMyGender();
	}
}
