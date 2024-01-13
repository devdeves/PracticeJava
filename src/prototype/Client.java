package prototype;

import prototype.classmatesNotebook.Notebook;
import prototype.classmatesNotebook.NotebookRegistry;
import prototype.classmatesNotebook.PremiumNotebook;
import prototype.student.IntelligentStudent;
import prototype.student.Student;
import prototype.student.StudentRegistry;

import java.util.Objects;
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

        // MAKE OBJECT FOR CLASSMATES NOTEBOOK //
        String notebookName = "classmates";

       NotebookRegistry notebookRegistry = initiliseNotebookRegistry();
       Notebook newNotebook = getPrototypeForNotebook(notebookRegistry,notebookName);
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

    private static StudentRegistry initialiseAndGetRegistry(){
        // Make Object from Prototype Classes //
        Student normalStudent = new Student("mdev132@gmail.com","dev",25,"gniot");
        IntelligentStudent intelligentStudent = new IntelligentStudent("intelligent@gmail.com","dev",32,"collage",138);
        StudentRegistry studentRegistry = new StudentRegistry();

        //  DIFFERENT STUDENT OBJECT REGISTER OBJECT  //
        studentRegistry.register("NORMAL_STUDENT",normalStudent);
        studentRegistry.register("INTELLIGENT_STUDENT",intelligentStudent);
        return studentRegistry;
    }

    private static NotebookRegistry initiliseNotebookRegistry(){
        Notebook newNoteBook = new Notebook("A4",1000,"white","Life full of surprises");
        PremiumNotebook premiumNoteBook = new PremiumNotebook("A4",1000,"white","Learning will get you ahead","birdimage","blankAndruleOneside");
        NotebookRegistry notebookRegistry = new NotebookRegistry();

        // REGISTER ALL TYPE NOTEBOOK OBJECTS //
        notebookRegistry.register("BASIC",newNoteBook);
        notebookRegistry.register("PREMIUM",premiumNoteBook);
        return  notebookRegistry;
    }

    private static Notebook getPrototypeForNotebook(NotebookRegistry notebookRegistry, String notebookName){
        // Here Implemented Registory for Student //

        if(Objects.equals(notebookName, "classmates")) {
            return notebookRegistry.get("PREMIUM");
        }else{
            return notebookRegistry.get("BASIC");
        }
    }
}

