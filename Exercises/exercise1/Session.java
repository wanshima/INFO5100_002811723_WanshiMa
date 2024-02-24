package Exercises.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Session {
    private List<Student> students;

    public Session() {
        this.students = new ArrayList<>(20);
    }

    public void addStudent(Student student) {
        if (students.size() < 20) {
            students.add(student);
        }
    }

    public void calculateAverageQuizScore() {
        for (Student student : students) {
            int sum = 0;
            for (int score : student.getQuizScores()) {
                sum += score;
            }
            int average = sum / student.getQuizScores().size();
            System.out.println(student.name + " average quiz score: " + average);
        }
    }

    public void printQuizScoresInAsendingOrder(){
        for (Student student : students) {
            List<Integer> scores = student.getQuizScores();
            Collections.sort(scores);
            System.out.println("Quiz Scores in Ascending Order: " + scores);
        }
    }

    public void printPartTimeStudentNames() {
        System.out.println("Part-Time Students:");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.getName());
            }
        }
    }

    public void printFullTimeStudentExamScores() {
        System.out.println("Full-Time Students' Exam Scores:");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                FullTimeStudent fullTimeStudent = (FullTimeStudent) student;
                int[] examScores = fullTimeStudent.getExamScores();
                System.out.println(fullTimeStudent.getName() + "'s Exam Scores: [" + examScores[0] + ", " + examScores[1] + "]");
            }
        }
    }

    }
    

