import java.util.Scanner;

public class TestingSystemCorr1 {

    public static void main(String[] args) {

        String[][][] questionsAndAnswers = {
                {{"Назовите самую большую планету Солнечной системы."}, {"3"}, {"1. Сатурн", "2. Венера", "3. Юпитер", "4. Марс", "5. Нептун"}},
                {{"Как называется галактика, в которой находится Солнечная система?"}, {"1"}, {"1. Млечный путь", "2. Галактика Андромеды", "3. M 110"}},
                {{"Назовите область Солнечной системы, находящуюся между планетами земной группы (Меркурий, Венера, Земля, Марс) " +
                        "и газовыми гигантами (Юпитер, Сатурн, Уран и Нептун)."}, {"2"}, {"1. Пояс Койпера", "2. Пояс астероидов", "3. Пояс Ориона"}}
        };

        String question;
        String[] answers;
        int rightAnswer;
        int answerGiven;
        int rightAnswersGiven = 0;
        int wrongAnswersGiven;
        Scanner scanner = new Scanner(System.in);

        for (String[][] questionAnswer: questionsAndAnswers) {

            question = questionAnswer[0][0];
            rightAnswer = Integer.parseInt(questionAnswer[1][0]);
            answers = questionAnswer[2];


            System.out.println(question);
            for (String answer: answers) {
                System.out.println(answer);
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
