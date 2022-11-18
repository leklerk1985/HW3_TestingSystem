import java.util.Scanner;

public class TestingSystem {
    public static void main(String[] args) {

        Object[][][] questionsAndAnswers = {
                {{"Назовите самую большую планету Солнечной системы."},
                        {3},
                        {"1. Сатурн", "2. Венера", "3. Юпитер", "4. Марс", "5. Нептун"}},
                {{"Как называется галактика, в которой находится Солнечная система?"},
                        {1},
                        {"1. Млечный путь", "2. Галактика Андромеды", "3. M 110"}},
                {{"Назовите область Солнечной системы, находящуюся между планетами земной группы и газовыми гигантами."},
                        {2},
                        {"1. Пояс Койпера", "2. Пояс астероидов", "3. Пояс Ориона"}}};

        String question;
        Object[] answers;
        int rightAnswer;
        int answerGiven;
        int rightAnswersGiven = 0;
        int wrongAnswersGiven;
        Scanner scanner = new Scanner(System.in);

        for (Object[][] questionAnswer: questionsAndAnswers) {

            question = (String) questionAnswer[0][0];
            rightAnswer = (int) questionAnswer[1][0];
            answers = questionAnswer[2];


            System.out.println(question);
            for (Object answer: answers) {
                System.out.println((String) answer);
            }
            System.out.println();


            answerGiven = Integer.parseInt(scanner.next());
            if (answerGiven == rightAnswer) {
                rightAnswersGiven++;
                System.out.println("Правильно");
            } else {
                System.out.println("Неправильно");
            }
            System.out.println();

        }

        wrongAnswersGiven = questionsAndAnswers.length - rightAnswersGiven;
        System.out.println("Результат: правильно " + rightAnswersGiven + ", неправильно " + wrongAnswersGiven + ".");

    }
}
