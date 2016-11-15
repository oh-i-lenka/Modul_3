package Homework_3_3;

import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        courses();
    }

    static Course[] courses(){
        Course[] coursesTaken = new Course[5];

        Course English = new Course("English A1", "Pilipenko", 90);
        Course Deutsch = new Course(new Date(116, 10, 1), "Deutsch B1");
        Course JavaCore = new Course(new Date(116, 9, 1), "GoIT");
        Course DifferentialEquations = new Course("DifferentialEqutions", "Schevchenko", 120);
        Course NewLife = new Course(new Date(117, 0, 1), "LosingWeight");

        coursesTaken[0] = English;
        coursesTaken[1] = Deutsch;
        coursesTaken[2] = JavaCore;
        coursesTaken[3] = DifferentialEquations;
        coursesTaken[4] = NewLife;

        return coursesTaken;
    }

    static void Students(){

        Student Petrov = new Student("Petr", "Petrov", 225);
        Student Ivanov = new Student("Ivanov", courses());
        CollegeStudent Sidorov = new CollegeStudent("Sidor", "Sidorov", 337, 22, courses(), "KNU", 5, 1111111111);
        CollegeStudent Kuznecov = new CollegeStudent("Ivan", "Kuznecov", 340);
        CollegeStudent Kovalev = new CollegeStudent("Kovalev", courses());
        SpecialStudent Smith = new SpecialStudent("John", "Smith", 107, 24, courses(), "DonNU", 4, 222222222);
        SpecialStudent Schmidt = new SpecialStudent("Johanes", "Schmidt", 240);
        SpecialStudent TheKey = new SpecialStudent(314159265);
    }
}

