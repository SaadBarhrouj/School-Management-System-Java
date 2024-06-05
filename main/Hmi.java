package main;

import models.School;
import models.Student;
import models.Teacher;
import models.Person;

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
            switch (action){
                case "addStudent":
                    Hmi.addStudent();
                      break;
                      case "printAllStudents":
                          Hmi.printAllStudents();
                          break;
                case "addTeacher":
                    Hmi.addTeacher();
                    break;
                    case "printAllTeachers":
                        Hmi.printAllTeachers();
                        break;


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
    private static void addTeacher(){
        Scanner reader=new Scanner(System.in);
        Teacher teacher=new Teacher();
        System.out.println("plz enter the name of the teacher");
       teacher.setName(reader.next());
        System.out.println("plz enter the age of the teacher");
        teacher.setAge(reader.nextInt());
        System.out.println("plz enter the salary of the teacher ");
        teacher.setSalary(reader.nextFloat());
        Hmi.schoolServices.addTeacher(teacher);

    }
    public static void printAllStudents(){
        for(Student student:schoolServices.getMySchool().getStudents()){
            System.out.println(student.getName() + " " + student.getAge() + " " );
        }
    }

        public static void printAllTeachers(){
            for(Teacher teacher:schoolServices.getMySchool().getTeachers()){
                System.out.println(teacher.getName() + " " + teacher.getAge() + " " );
            }
        }
 private static void setDataPerson (Person p){
     Scanner reader=new Scanner(System.in);
     System.out.println("plz enter the name ");
    p.setName(reader.next());
     System.out.println("plz enter the age ");
     p.setAge(reader.nextInt());

     if(p instanceof Teacher){
         System.out.println("plz enter the salary ");
         ((Teacher )p).setSalary(reader.nextFloat());
     }else if(p instanceof Student){
         System.out.println("plz enter the phone number ");
         ( (Student) p).setParentPhoneNumber(reader.next());

     }

     }

     }







