package prototype.student;

public class IntelligentStudent extends Student{
    private int iq;
    /**
     * This method will call parent default constructor and pass required param to that
     *
     **/
    public IntelligentStudent(String email,String name,int age,String universityName,int iq){
        super(email, name, age, universityName);
        this.iq =iq;
    }

    /**
     * This method will call parent copy constructor and pass required param to that
     *
     **/
    public IntelligentStudent(IntelligentStudent studentNew) {
        super(studentNew);
        this.iq = studentNew.iq;
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
