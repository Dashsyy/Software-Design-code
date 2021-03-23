package com.company;

public class StudentExcercise {
    public void run(){
        // write your code here
        Student s1,s2;
        s1 = new Student();
        s2 = new Student();

        s1.name="Heng";
        s1.tel="012 234 543";

        s2.name="Sun";
        s2.tel="012 887 556";
        System.out.println("Student s1 id = "+s1.id+", name "+s1.name);
        System.out.println("Student s2 id = "+s2.id+", name "+s2.name);
    };
}
