package m.kash.lldpatternsseptember2024.BuilderPattern;

public class Client {
    public static void main(String[] args) {
       // Builder builder=new Builder();  // to create the object of Builder class manually

//        Builder builder=Student.getBuilder(); //we create the object of builder class from student.getBuilder method
//        builder.setName("Kaushal");
//        builder.setBatch("Sept21");
//        builder.setGradYear(2022);
//        builder.setAge(26);
//        builder.setUniversityName("Scaler");

       // Student student=new Student(builder);

       // Student student=builder.build();
        Student student= Student.getBuilder()
                .setName("Kaushal")
                .setAge(26)
                .setBatch("Sept21")
                .setGradYear(2022)
                .setUniversityName("Scalar")
                .build();

    }
}
