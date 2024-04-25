package Exercises.exercise1;

/**
 * Main class to manage simulation of sessions involving both part-time and full-time students.
 */
public class Main {
    public static void main(String[] args) {
        // Initialize a new session for managing students
        Session session = new Session();

        // Create and add 10 part-time students to the session with random quiz scores
        for (int i = 1; i <= 10; i++) {
            PartTimeStudent partTimeStudent = new PartTimeStudent("PartTimeStudent" + i);
            for (int score = 0; score < 15; score++) {
                partTimeStudent.addQuizScore((int) (70 + (Math.random() * (100 - 70)))); 
            }
            session.addStudent(partTimeStudent);
        }

        // Create and add 10 full-time students to the session with random quiz and exam scores
        for (int i = 1; i <= 10; i++) {
            FullTimeStudent fullTimeStudent = new FullTimeStudent("FullTimeStudent" + i, (int) (70 + (Math.random() * (100 - 70))), (int) (70 + (Math.random() * (100 - 70))));
            for (int score = 0; score < 15; score++) {
                fullTimeStudent.addQuizScore((int) (70 + (Math.random() * (100 - 70))));
            }
            session.addStudent(fullTimeStudent);
        }

        // Perform operations on the collected data
        session.calculateAverageQuizScore();
        session.printQuizScoresInAsendingOrder();
        session.printPartTimeStudentNames();
        session.printFullTimeStudentExamScores();
    }
}
