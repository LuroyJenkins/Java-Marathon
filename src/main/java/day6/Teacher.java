package day6;

import java.util.Random;

public class Teacher {
    String name, subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student) {
    String grade;
        switch (2 + (int) (Math.random() * 4 )){
            case(2):
                grade = "неудовлетворительно";
                break;
            case(3):
                grade = "удовлетворительно";
                break;
            case(4):
                grade = "хорошо";
                break;
            default:
                grade = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName()
                + " по предмету " + this.subject + " на оценку " + grade);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}
