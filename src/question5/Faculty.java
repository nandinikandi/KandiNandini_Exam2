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
public class Faculty extends Employee {

    public int officeHours;
    public int numOfTeachingSubjects;

    public Faculty(String name, String address, String phone, String email, String office, double salary,
            int officeHours, int numOfTeachingSubjects) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.numOfTeachingSubjects = numOfTeachingSubjects;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public int getNoOfTeachingHours() {
        return numOfTeachingSubjects;
    }

    public void setNoOfTeachingHours(int numOfTeachingSubjects) {
        this.numOfTeachingSubjects = numOfTeachingSubjects;
    }

    @Override
    public String toString() {
        return "\nClass Name: Faculty\nName: " + super.getName() + "\nAddress: " + super.getAddress()
                + "\nPhoneNumber: " + super.getPhoneNumber() + "\nEmail address: " + super.getEmailAddress()
                + "\nOffice: " + super.getOffice() + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired()
                + "\nOffice hours: " + officeHours + "\nNo Of TeachingHours: " + numOfTeachingSubjects;
    }
}
