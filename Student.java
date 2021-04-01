package com.section2;

public class Student {
    int id;
    String name;
    String phone;
    String email;
    String address;

    void updateEmail(String newEmail) {
        email = newEmail;
    }

    void printStudent() {
        System.out.println("Student id:" + id + " name:" + name + " email:" + email + " address:" + address);
    }

    public static void main(String[] args){
        Student s = new Student();
        s.id = 101;
        s.name = "hamid";
        s.phone = "7028329829";
        s.email = "khanham4@gamil.com";
        s.address= "pwc";

        s.printStudent();
        s.updateEmail( "ardent1989@gmail.com");

        System.out.println(" the email is updated" );
        s.printStudent();
    }
}