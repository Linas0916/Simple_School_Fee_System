package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;
    private int totalProfit;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
        totalProfit = 0;
    }


    /**
     *
     * @return total money earned by the school
     */


    public int totalMoneyEarned(List<Student> students) {
        totalMoneyEarned = 0;

        for (Student student: students) {
            totalMoneyEarned+= student.getFeesPaid();
        }

        return totalMoneyEarned;
    }


    public int totalMoneySpent(List<Teacher> teachers) {
        totalMoneySpent = 0;

        for (Teacher teacher: teachers) {
            totalMoneySpent+= teacher.getSalary();
        }

        return totalMoneySpent;
    }

    public int totalSchoolProfit() {
        totalProfit = 0;

        totalProfit = totalMoneyEarned - totalMoneySpent;

    return totalProfit;
    }

}
