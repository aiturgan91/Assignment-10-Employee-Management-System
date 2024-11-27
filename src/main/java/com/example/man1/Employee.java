package com.example.man1;

public class Employee {
    private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract double calculateSalary();

        public abstract String getEmployeeType();
    }
