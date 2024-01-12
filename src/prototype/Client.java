package prototype;

public class Client {
    public static void main(String[] args) {
        Student st = getPrototypeStudent();
        Student clone = new Student(st);

        IntelligentStudent intelligentStudent = IntelligentStudentPrototype();
        IntelligentStudent sloneOfParent = new IntelligentStudent(intelligentStudent);

    }

    private static Student getPrototypeStudent(){
        return new Student("mdev132@gmail.com","dev",25,"gniot");
    }
    private static IntelligentStudent IntelligentStudentPrototype(){
        return new IntelligentStudent("mdev132@gmail.com","dev",25,"gniot",130);
    }
}
