package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher(1, "Linas", 20000);
        Teacher t2 = new Teacher(2, "Tomas", 10000);
        Teacher t3 = new Teacher(3, "Toma", 11000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);

        Student s1 = new Student(1,"Lina", 5);
        Student s2 = new Student(2,"Toma", 6);
        Student s3 = new Student(3,"Vika", 4);

        List<Student > studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        School school1 = new School(teacherList,studentList);

        s1.feesPaid(28000);
        s2.feesPaid(2000);

        System.out.println("Total fees paid by student "+ s1.getName()+" = "+s1.getFeesPaid());
        System.out.println("Total fees paid by student "+ s2.getName()+" = "+s2.getFeesPaid());
        s2.feesPaid(3000);

        System.out.println("Total fees paid by student "+ s2.getName()+" = "+s2.getFeesPaid());

        System.out.println("Money earned by the school " + school1.totalMoneyEarned(studentList));
        System.out.println("Money spent by the school on teacher's salary " + school1.totalMoneySpent(teacherList));
        System.out.println("School's profit " + school1.totalSchoolProfit());
        System.out.println(s1.getName());
        System.out.println(s3.toString());
    }
}
