package m.kash.lldpatternsseptember2024.Prototype;

public class IntelligentStudent extends Student{
    private int iq;


    public IntelligentStudent(){

    }

    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq= intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent clone() {
        //IntelligentStudent intelligentStudent=new IntelligentStudent();
        return new IntelligentStudent(this);
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
