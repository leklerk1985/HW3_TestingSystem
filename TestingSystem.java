import java.util.Scanner;

public class TestingSystem {

    public static void main(String[] args) {

        String[] questions = {"Назовите самую большую планету Солнечной системы.",
            "Как называется галактика, в которой находится Солнечная система?",
            "Назовите область Солнечной системы, находящуюся между планетами земной группы (Меркурий, Венера, Земля, Марс) и газовыми гигантами (Юпитер, Сатурн, Уран и Нептун)."};
        String[][] answers = {{"1. Сатурн", "2. Венера", "3. Юпитер", "4. Марс", "5. Нептун"},
            {"1. Млечный путь", "2. Галактика Андромеды", "3. M 110"},
            {"1. Пояс Койпера", "2. Пояс астероидов", "3. Пояс Ориона"}};
        int[] rightAnswers = {3, 1, 2};
        int rightAnswersGiven = 0;
        int wrongAnswersGiven;
        int answerGiven;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            for (int j = 0; j < answers[i].length; j++) {
                System.out.println(answers[i][j]);
            }
            System.out.println();

            answerGiven = Integer.parseInt(scanner.next());
            if (answerGiven == rightAnswers[i]) {
                rightAnswersGiven++;
                System.out.println("Правильно");
            } else {
                System.out.println("Неправильно");
            }
            System.out.println();

        }

        wrongAnswersGiven = questions.length - rightAnswersGiven;
        System.out.println("Результат: правильно " + rightAnswersGiven + ", неправильно " + wrongAnswersGiven + ".");

    }

}
