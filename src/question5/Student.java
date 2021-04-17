/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Nandini Kandi
 */
public class Student extends Person {

    public final static String classStatus = "Graduate";
    public float grade;

    public Student(String name, String address,
            String phone, String email, float grade) {
        super(name, address, phone, email);
        this.grade = grade;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\nClass Name: Student\nName: " + super.getName() + "\nAddress: " + super.getAddress() + "\nPhoneNumber: " + super.getPhoneNumber() + "\nEmail address: " + super.getEmailAddress() + "\nClass Status: " + classStatus + "\nGrade: " + grade;
    }
}
