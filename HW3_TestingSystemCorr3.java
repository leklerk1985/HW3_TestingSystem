import java.util.Scanner;

public class HW3_TestingSystemCorr3 {
    public static void main(String[] args) {
        QuestionAnswers[] dataQuestAns = {
                new QuestionAnswers("Назовите самую большую планету Солнечной системы.",
                        new String[]{"1. Сатурн", "2. Венера", "3. Юпитер", "4. Марс", "5. Нептун"},
                        3),
                new QuestionAnswers("Как называется галактика, в которой находится Солнечная система?",
                        new String[]{"1. Млечный путь", "2. Галактика Андромеды", "3. M 110"},
                        1),
                new QuestionAnswers("Назовите область Солнечной системы, находящуюся между " +
                        "планетами земной группы и газовыми гигантами.",
                        new String[]{"1. Пояс Койпера", "2. Пояс астероидов", "3. Пояс Ориона"},
                        2)};
        int rightAnswersGiven = 0;
        int wrongAnswersGiven;
        int answerGiven;
        Scanner scanner = new Scanner(System.in);

        for (QuestionAnswers questAns: dataQuestAns) {
            questAns.printQuestion();
            questAns.printAnswers();

            answerGiven = Integer.parseInt(scanner.next());
            if (answerGiven == questAns.getRightAnswer()) {
                rightAnswersGiven++;
                System.out.println("Правильно");
            } else {
                System.out.println("Неправильно");
            }
            System.out.println();
        }

        wrongAnswersGiven = dataQuestAns.length - rightAnswersGiven;
        System.out.println("Результат: правильно " + rightAnswersGiven + ", неправильно " + wrongAnswersGiven + ".");
    }
}

class QuestionAnswers {
    private String question;
    private String[] answers;
    private int rightAnswer;

    QuestionAnswers(String question, String[] answers, int rightAnswer) {
        this.question = question;
        this.answers = answers;
        this.rightAnswer = rightAnswer;
    }

    public void printQuestion() {
        System.out.println(question);
    }

    public void printAnswers() {
        for (String answer: answers) {
            System.out.println(answer);
        }
        System.out.println();
    }

    public int getRightAnswer() {
        return rightAnswer;
    }
}