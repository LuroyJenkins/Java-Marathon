package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иван Васильевич Первушин", "Физика");
        Student student = new Student("Никита Старков");

        teacher.evaluate(student);
    }
}
