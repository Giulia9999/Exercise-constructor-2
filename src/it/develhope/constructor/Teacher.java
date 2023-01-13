package it.develhope.constructor;

public class Teacher  extends Student{
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
    public void assignGrade(Student alum, int finalGrade){
        this.setGrade(finalGrade);
    }
}
