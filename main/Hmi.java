package main;

import models.School;
import models.Student;
import services.SchoolServices;

import java.util.Scanner;

public class Hmi {
    private static SchoolServices schoolServices;

    public static void start(){
        School school=createSchool();
        System.out.println(" ==> Welcome To " + school.getName() + " In " + school.getAdress() + " <== ");
        Scanner sc=new Scanner(System.in);
        String action;
        do{
            System.out.println("what do you want to do?");
            action=sc.next();
            if(action.equals("addStudent")){Hmi.addStudent();
            }
            if (action.equals("printAllStudents")) {
                for(Student student:school.getStudents()){
                    System.out.println(student.getName() + " " + student.getAge() + " " );
                }
            }


        }while (!action.equals("exit"));
    }

    private static School createSchool (){
        School school=new School();
        school.setName("ENSA");
        school.setAdress("TETOUAN MAROC");
        school.setPhoneNumber("0666666666");
        SchoolServices schoolServices=new SchoolServices(school);
        return school;
    }
    private static void addStudent (){
        Scanner reader=new Scanner(System.in);
        Student student=new Student();
        System.out.println("plz enter the name of the student");
        student.setName(reader.next());
        System.out.println("plz enter the age of the student");
        student.setAge(reader.nextInt());
        System.out.println("plz enter the phone number ");
        student.setParentPhoneNumber(reader.next());
        Hmi.schoolServices.addStudent(student);

    }

    }
