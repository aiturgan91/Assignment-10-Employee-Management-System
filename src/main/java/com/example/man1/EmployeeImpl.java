package com.example.man1;

public class EmployeeImpl extends Employee {
    public EmployeeImpl(String name) {
        super(name);
    }

    /**
     * @return
     */
    @Override
    public double calculateSalary() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public String getEmployeeType() {
        return "";
    }
}
