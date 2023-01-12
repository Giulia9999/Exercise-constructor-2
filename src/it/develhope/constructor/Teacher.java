package it.develhope.constructor;

public class Teacher {
    private String teacherName;

    public Teacher(){
        System.out.println("Teacher object created");
    }

    public String getName(){
        return teacherName;
    }
    public void setName(String newName){
        this.teacherName = newName;
    }
    Student student = new Student();
    private int teacherGrade = student.getGrade();


    public void assignGrade(Student alum, int finalGrade){
        this.teacherGrade = finalGrade;
    }
}
