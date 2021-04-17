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
public class PersonDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Person person = new Person("Nandini", "Maryville, MO", "567-189-1234", "nan@mandy");

        Student student = new Student("Kandi", "Kansas, MO", "567-189-1235", "nan@mandy", 3.3f);

        Employee employee = new Employee("Nandy", "Kansas city, MO", "567-190-1235", "nan@mandy", "A123", 5000);

        Faculty faculty = new Faculty("Nandini K", "Des Monies, IA", "567-290-1235", "nan@mandy", "A123", 6000, 40, 4);

        Staff staff = new Staff("Nandini Kandi", "Des Monies, IA", "534-290-1235", "nan@mandy", "A123", 7000, "Professor");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }

}
