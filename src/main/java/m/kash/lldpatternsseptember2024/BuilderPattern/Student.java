package m.kash.lldpatternsseptember2024.BuilderPattern;

public class Student {
    String name;
    int age;
    String batch;
    String universityName;
    int gradYear;
    String phoneNumber;

    private Student(Builder builder){

        this.name= builder.name;
        this.age= builder.age;
        this.batch=builder.batch;
        this.gradYear=builder.gradYear;
    }


    //we crete  method in student class itself to create a builder object.
    //earlier Builder class was independent.
    //but to create a student class we need builder object first
    //we use public "static" method as we want the builder object to be created before the student object.
    public static Builder getBuilder(){
        return new Builder();
    }


    public static class Builder {
        String name;
        int age;
        String batch;
        String universityName;
        int gradYear;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }


        public Student build(){
            //Validation
            if(this.getGradYear() < 2020){
                throw new RuntimeException("GradYear should be after 2020");
            }
            //use this method to actually build Student object
            return new Student(this);
        }
    }

}
