package models;

public class Teacher extends Person {
    float salary;

public Teacher (String name ,int age,float salary){
    super(name,age);
    this.salary=salary;

}
public Teacher() {

}
public void SetSalary(float salary) {
    this.salary = salary;
}
public float getSalary() {
    return salary;
}
}
