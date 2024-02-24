package Exercises.exercise1;

import java.util.ArrayList;
import java.util.List;

public abstract class Student {
    protected String name;
    protected List<Integer> quizScores;

    public Student(String name) {
        this.name = name;
        this.quizScores = new ArrayList<>(15);
    }

    public void addQuizScore(int score) {
        if (quizScores.size() < 15) {
            quizScores.add(score);
        }
    }

    public List<Integer> getQuizScores() {
        return quizScores;
    }

    public String getName() {
        return name;
    }
}
