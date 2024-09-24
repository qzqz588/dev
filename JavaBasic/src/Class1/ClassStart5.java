package Class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1 = new Student(); //클래스 선언
        student1.name = "학생1"; //변수 참조값 .(dot)으로 접근
        student1.age = 19;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 18;
        student2.grade = 80;

        Student[] students = {student1, student2};
//        for (int i = 0; i < students.length; i++) {
//            Student s = students[i];
//            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
//
//        }
        for(Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
