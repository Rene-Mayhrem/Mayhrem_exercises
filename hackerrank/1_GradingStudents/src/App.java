import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> grades = new ArrayList<>();
    }
}

class Solution {
    public static List<Integer> gradingStudents (List<Integer> grades) {
        for (int grade : grades) {
            if (grade >= 40) {
                int nextMultiple = grade;
                while (nextMultiple % 5 != 0) {
                    nextMultiple++;
                }
                if ((nextMultiple - grade) < 3) {
                    grade = nextMultiple;
                }
            }
        }
        return grades;
    }
}