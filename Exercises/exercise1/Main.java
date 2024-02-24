package Exercises.exercise1;


public class Main {
    public static void main(String[] args) {
        Session session = new Session();

        for (int i = 1; i <= 10; i++) {
            PartTimeStudent partTimeStudent = new PartTimeStudent("PartTimeStudent" + i);
            for (int score = 0; score < 15; score++) {
                partTimeStudent.addQuizScore((int) (70 + (Math.random() * (100 - 70)))); 
            }
            session.addStudent(partTimeStudent);
        }
        
        for (int i = 1; i <= 10; i++) {
            FullTimeStudent fullTimeStudent = new FullTimeStudent("FullTimeStudent" + i, (int) (70 + (Math.random() * (100 - 70))), (int) (70 + (Math.random() * (100 - 70))));
            for (int score = 0; score < 15; score++) {
                fullTimeStudent.addQuizScore((int) (70 + (Math.random() * (100 - 70))));
            }
            session.addStudent(fullTimeStudent);
        }

        session.calculateAverageQuizScore();
        session.printQuizScoresInAsendingOrder();
        session.printPartTimeStudentNames();
        session.printFullTimeStudentExamScores();
    }
}
