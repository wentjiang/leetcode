package com.wentjiang.leetcode.q601_700;

import java.util.List;

public class Question690 {
    public int getImportance(List<Employee> employees, int id) {
        return getSubImportance(employees, id);
    }

    public int getSubImportance(List<Employee> employees, int id) {
        int importance = 0;
        Employee currentEmployee = null;
        for (Employee employee : employees) {
            if (employee.id == id) {
                currentEmployee = employee;
                break;
            }
        }
        if (currentEmployee != null) {
            importance += currentEmployee.importance;
            List<Integer> subordinates = currentEmployee.subordinates;
            if (subordinates != null) {
                for (Integer subordinate : subordinates) {
                    importance += getSubImportance(employees, subordinate);
                }
            }
        }
        return importance;
    }
}

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};