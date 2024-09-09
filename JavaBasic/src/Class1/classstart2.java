package Class1;

public class classstart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2","학생3"};
        int[] studentAges = {15, 16,17};
        int[] studentGrades = {90, 80,30};

        for(int i =0; i < studentNames.length;i++){
        System.out.println(studentNames[i]+ studentAges[i]+studentGrades[i]);
    }
}
}
