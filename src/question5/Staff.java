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
public class Staff extends Employee {

    private String title;

    public Staff(String name, String address, String phone,
            String email, String office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "\nClass Name: Staff\nName: " + super.getName() + "\nAddress: " + super.getAddress()
                + "\nPhoneNumber: " + super.getPhoneNumber() + "\nEmail address: " + super.getEmailAddress()
                + "\nOffice: " + super.getOffice() + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired()
                + "\nTitle: " + title;
    }
}
