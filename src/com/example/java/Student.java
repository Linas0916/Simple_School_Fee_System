package com.example.java;

public class Student {
    private final int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student (int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 30000;

    }


    @Override
    public String toString() {
        return "Student's name= " + name;
    }

    public String getName() {

        return name;
    }

    public int getFeesPaid() {

        return feesPaid;
    }

    public void feesPaid(int fees) {

        feesPaid =feesPaid + fees;
    }



}
