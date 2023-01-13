package it.develhope.constructor;

public class Student {
    private String name;
    private int grade;

    public Student(){}
    public Student(String studentName){
        System.out.println("Student object created");
        this.name = studentName;
    }

    public int getGrade(){
        return grade;
    }

    public int setGrade(int newGrade){
        this.grade = newGrade;
        return newGrade;
    }
    public void getStudentDetails(){
        System.out.println(this.name + " - voto: " + this.grade);
    }

}
