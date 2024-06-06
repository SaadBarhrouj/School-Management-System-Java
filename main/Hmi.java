package main;

import models.School;
import models.Student;
import models.Teacher;
import models.Person;
import tools.actions;


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
                case "findStudentByName":
                    Hmi.printDataPersonByName(actions.STUDENT);
                    break;
                case " findTeacherByName":
                    Hmi.printDataPersonByName(actions.TEACHER);
                    break;
                case "removeTeacherByName":
                    Hmi.removePerson(actions.TEACHER);
                    break;
                case "removeStudentByName":
                    Hmi.removePerson(actions.STUDENT);
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
       Hmi.setDataPerson(student);
        Hmi.schoolServices.addStudent(student);

    }
    private static void addTeacher(){
        Scanner reader=new Scanner(System.in);
        Teacher teacher=new Teacher();
       Hmi.setDataPerson(teacher);
        Hmi.schoolServices.addTeacher(teacher);

    }
    public static void printAllStudents(){
        for(Student student:schoolServices.getMySchool().getStudents()){
            System.out.println(student.getData() );
        }
    }

        public static void printAllTeachers(){
            for(Teacher teacher:schoolServices.getMySchool().getTeachers()){
                System.out.println(teacher.getData() );
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
     }
     else if(p instanceof Student){
         System.out.println("plz enter the phone number ");
         ( (Student) p).setParentPhoneNumber(reader.next());

     }

     }
     private static void printDataPerson(Person person ){
         if(person==null) {
             System.out.println("not found !!!!");
         }else {
             System.out.println(person.getData());
         }
     }


    private static Person findPersonByName(actions action){
        Scanner reader=new Scanner(System.in);
        System.out.println("plz enter the name ");
        String name = reader.next();
        Person p;
        if (action==actions.STUDENT){
            p =Hmi.schoolServices.getStudentByName(name);
        }else {
            p =Hmi.schoolServices.getTeacherByName(name);
        }
        return p;

    }
    private static void printDataPersonByName(actions action){
        Person p=findPersonByName(action);
        printDataPerson(p);
    }

    private static void removePerson (actions  action){
        Person p=Hmi.findPersonByName(action);
        if (p instanceof Student){
            Hmi.schoolServices.removeStudent((Student)p);

        }else{
            Hmi.schoolServices.removeTeacher((Teacher)p);

        }
    }






     }









