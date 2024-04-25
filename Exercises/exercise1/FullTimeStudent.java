package Exercises.exercise1;

/**
 * Represents a full-time student with additional exam scores.
 */
public class FullTimeStudent extends Student{
    private int examScore1;
    private int examScore2;

    /**
     * Constructor for FullTimeStudent, including initial exam scores.
     * @param name Name of the student.
     * @param examScore1 Score for the first exam.
     * @param examScore2 Score for the second exam.
     */
    public FullTimeStudent(String name, int examScore1, int examScore2) {
        super(name);
        this.examScore1 = examScore1;
        this.examScore2 = examScore2;
    }

    /**
     * Retrieves the exam scores for this student.
     * @return Array of two integers containing the exam scores.
     */
    public int[] getExamScores() {
        return new int[]{examScore1, examScore2};
    }
    
}
