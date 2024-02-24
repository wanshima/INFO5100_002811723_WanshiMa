package Exercises.exercise1;

public class FullTimeStudent extends Student{
    private int examScore1;
    private int examScore2;

    public FullTimeStudent(String name, int examScore1, int examScore2) {
        super(name);
        this.examScore1 = examScore1;
        this.examScore2 = examScore2;
    }

    public int[] getExamScores() {
        return new int[]{examScore1, examScore2};
    }
    
}
