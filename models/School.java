package models;

import java.util.ArrayList;

public class School {
    String name;
    String adress;
    String phoneNumber;
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;
    ArrayList<Grade> grades;

    private void  initObject(){
    students = new ArrayList<Student>();
    teachers = new ArrayList<Teacher>();
    grades = new ArrayList<Grade>();
    }
    public School(String name) {
        this.name = name;
        this.initObject();
    }
    public School() {
        this.initObject();
    }

public void setName (String name) {
        this.name = name;
}
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getAdress() {
        return adress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
    public ArrayList<Grade> getGrades() {
        return grades;
    }

}

