package services;
import models.School;
import models.Student;
import models.Teacher;
import models.Grade;


public class SchoolServices {
    School mySchool;
    public SchoolServices(School mySchool) {
        this.mySchool = mySchool;
    }
    public SchoolServices() {

    }
    public School getMySchool() {
        return mySchool;
    }
    public void setMySchool(School mySchool) {
        this.mySchool = mySchool;
    }

    public void addStudent (Student student) {

        this.mySchool.getStudents().add(student);
}
    public void addTeacher (Teacher teacher) {
        this.mySchool.getTeachers().add(teacher);
    }
    public void addGrade (Grade grade) {
        this.mySchool.getGrades().add(grade);

    }

    public void removeStudent (Student student) {
        this.mySchool.getStudents().remove(student);
    }
    public void removeTeacher(Teacher teacher) {
        this.mySchool.getTeachers().remove(teacher);
    }
    public void removeGrade (Grade grade) {
        this.mySchool.getGrades().remove(grade);
    }

    public Student getStudentByName (String name) {
        Student a =null;
        for (Student student : this.mySchool.getStudents()) {
            if (student.getName().equals(name)) {
                a = student;
            }

        }
        return a;

    }
    public Teacher getTeacherByName (String name) {
        for (Teacher teacher:this.mySchool.getTeachers()) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }

    public Grade getGradeByCode (String code) {
        for (Grade grade:this.mySchool.getGrades()) {
            if (grade.getCode().equals(code)) {
                return grade;
            }
        }
        return null;
    }


}
