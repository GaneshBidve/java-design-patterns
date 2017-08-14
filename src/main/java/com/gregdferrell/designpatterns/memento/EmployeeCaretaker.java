package com.gregdferrell.designpatterns.memento;

import java.util.Stack;

// caretaker
public class EmployeeCaretaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee employee) {
        employeeHistory.push(employee.save());
    }

    public void revert(Employee employee) {
        employee.revert(employeeHistory.pop());
    }
}
