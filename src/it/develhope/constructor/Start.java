package it.develhope.constructor;

public class Start {
    public static void main(String[] args) {
        Student student1 = new Student("Marco");
        Student student2 = new Student("Luca");
        student1.setGrade(7);
        student2.setGrade(9);

        Teacher teacher = new Teacher();
        teacher.setName("Giovanni");
        System.out.println("Teacher name is " + teacher.getName());

        student1.getStudentDetails();
        student2.getStudentDetails();


    }

}
