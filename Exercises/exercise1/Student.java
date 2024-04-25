package Exercises.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract base class representing a student with a name and a collection of quiz scores.
 */
public abstract class Student {
    protected String name;
    protected List<Integer> quizScores;

    /**
     * Constructor for creating a student with an initial name.
     * @param name The name of the student.
     */
    public Student(String name) {
        this.name = name;
        this.quizScores = new ArrayList<>(15);
    }

    /**
     * Adds a quiz score to the list of scores, ensuring no more than 15 scores are stored.
     * @param score The quiz score to add.
     */
    public void addQuizScore(int score) {
        if (quizScores.size() < 15) {
            quizScores.add(score);
        }
    }

    /**
     * Returns the list of all quiz scores recorded for the student.
     * @return A list of integers representing the quiz scores.
     */
    public List<Integer> getQuizScores() {
        return quizScores;
    }

    /**
     * Retrieves the name of the student.
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }
}
