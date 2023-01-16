package it.develhope.constructor;

public class Start {
    public static void main(String[] args) {
        Student student1 = new Student("Marco");
        Student student2 = new Student("Luca");

        Teacher teacher = new Teacher();
        teacher.setName("Giovanni");
        System.out.println("Teacher name is " + teacher.getName());

       teacher.assignGrade(student1, 6);
       teacher.assignGrade(student2, 5);

       student1.getStudentDetails();
       student2.getStudentDetails();


    }

}
