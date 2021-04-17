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
import java.util.Date;

public class Employee extends Person {

    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name, String address, String phone,
            String email, String office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new Date();
    }

    public String getOffice() {
        return office;
    }

    public String getSalary() {
        return String.format("%.2f", salary);
    }

    public String getDateHired() {
        return dateHired.toString();
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired() {
        dateHired = new Date();
    }

    @Override
    public String toString() {
        return "\nClass Name: Employee\nName: " + super.getName() + "\nAddress: " + super.getAddress() + "\nPhoneNumber: " + super.getPhoneNumber() + "\nEmail address: " + super.getEmailAddress()
                + "\nOffice: " + office + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }
}
