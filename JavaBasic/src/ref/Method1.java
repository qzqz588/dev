package ref;

public class Method1 {
    public static void main(String[] args) {
    Student students = new Student(); //x001
    intitStudent(students, "학생1", 15 , 90);

    Student students2 = new Student();
    intitStudent(students2,"학생2", 16,80);

    printStudent(students);
    printStudent(students2);
    }

    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + "나이 : " + student.age + "학년 : "+ student.grade);
    }

    static void intitStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
}
