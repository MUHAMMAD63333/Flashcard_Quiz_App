import java.util.Scanner;

public class FlashcardQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions and answers
        String[][] flashcards = {
            {"What keyword is used to define a class in Java?", "class"},
            {"Which keyword is used to create an object?", "new"},
            {"What method is the entry point of a Java program?", "main"},
            {"Which symbol is used to end a statement in Java?", ";"},
            {"What keyword is used for inheritance in Java?", "extends"}
        };

        int score = 0;

        System.out.println("===== Welcome to the Java Flashcard Quiz =====\n");

        // Loop through each question
        for (int i = 0; i < flashcards.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + flashcards[i][0]);
            System.out.print("Your Answer: ");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase(flashcards[i][1])) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer is: " + flashcards[i][1] + "\n");
            }
        }

        System.out.println("===== Quiz Finished! =====");
        System.out.println("Your Score: " + score + "/" + flashcards.length);

        scanner.close();
    }
}
