package com.mycompany.test;
public class Test 
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        Lecturer l1=new Lecturer();
        s1.setId(1234);
        s1.setName("Lakamal");
        s1.setCourse("Compter Science");
        l1.setId(5678);
        l1.setName("Kasun");
        l1.setProgramme("Computer");
        
        System.out.println("Student Id is :"+s1.getId());
        System.out.println("Student Name is :"+s1.getName());
        System.out.println("Student Course is :"+s1.getCourse());
        
        System.out.println("Lecturer Id is :"+l1.getId());
        System.out.println("Lecturer Name is :"+l1.getName());
        System.out.println("Lecturer Programme is :"+l1.getProgramme());


    }
}
