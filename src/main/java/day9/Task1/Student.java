package day9.Task1;

public class Student extends Human {
    public String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем "+getName());
    }

    public String getGroupName() {
        return groupName;
    }
}
