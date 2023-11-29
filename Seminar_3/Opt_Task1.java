package Seminar_3;

import java.util.Date;

public class Opt_Task1 {

}
// 1) Переписать код в соответствии с Single Responsibility Principle:

class Employee {
    private String name;
    private Date dob;

    public Employee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}

/**
 * Employee finance class
 */
class Finance {

    private int baseSalary;

    public Finance(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Calculate the salary
     * 
     * @return clear salary
     */
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}
