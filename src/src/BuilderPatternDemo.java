class Student {

    private String name;
    private int age;
    private String branch;
    private String college;

    private Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.branch = builder.branch;
        this.college = builder.college;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println("College: " + college);
    }

    public static class StudentBuilder {

        private String name;
        private int age;
        private String branch;
        private String college;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public StudentBuilder setCollege(String college) {
            this.college = college;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}

public class BuilderPatternDemo {

    public static void main(String[] args) {

        Student student = new Student.StudentBuilder()
                .setName("sohum")
                .setAge(30)
                .setBranch("ME")
                .setCollege("GL bAjaj")
                .build();

        student.display();
    }
}