package prototype;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        // Prototype Object of Student
//        Student st = getPrototypeStudent();
//        Student clone = new Student(st);
//
//        IntelligentStudent intelligentStudent = IntelligentStudentPrototype();
//        IntelligentStudent sloneOfParent = new IntelligentStudent(intelligentStudent);
        //

        // INITILISE STUDENT REGISTORY AND GET REGISTERED DATA //
        StudentRegistry studentRegistry = initialiseAndGetRegistry();
        Student st = getPrototypeStudent(studentRegistry);
        Student clone = st.clone();
    }

    private static Student getPrototypeStudent(StudentRegistry studentRegistry){
        // Here Implemented Registory for Student //
             Random random = new Random();
             int randomInt = random.nextInt();
            if(randomInt % 2 == 0) {
                return studentRegistry.get("NORMAL_STUDENT");
            }else{
                return studentRegistry.get("INTELLIGENT_STUDENT");
            }
        }
    private static IntelligentStudent IntelligentStudentPrototype(){
        return new IntelligentStudent("mdev132@gmail.com","dev",25,"gniot",130);
    }

    private static StudentRegistry initialiseAndGetRegistry(){
        // Make Object from Prototype Classes //
        Student normalStudent = new Student("mdev132@gmail.com","dev",25,"gniot");
        IntelligentStudent intelligentStudent = new IntelligentStudent("intelligent@gmail.com","dev",32,"collage",138);
        StudentRegistry studentRegistry = new StudentRegistry();

        // REGISTER DIFFERENT STUDENT OBJECT //
        studentRegistry.register("NORMAL_STUDENT",normalStudent);
        studentRegistry.register("INTELLIGENT_STUDENT",intelligentStudent);
        return studentRegistry;
    }
}

