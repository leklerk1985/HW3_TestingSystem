import java.util.Scanner;

public class TestingSystemCorr2 {

    public static void main(String[] args) {

        String[][] questionsAndAnswers = {{"Назовите самую большую планету Солнечной системы.", "3", "1. Сатурн", "2. Венера", "3. Юпитер", "4. Марс", "5. Нептун"},
                {"Как называется галактика, в которой находится Солнечная система?", "1", "1. Млечный путь", "2. Галактика Андромеды", "3. M 110"},
                {"Назовите область Солнечной системы, находящуюся между планетами земной группы (Меркурий, Венера, Земля, Марс) " +
                        "и газовыми гигантами (Юпитер, Сатурн, Уран и Нептун).", "2", "1. Пояс Койпера", "2. Пояс астероидов", "3. Пояс Ориона"}};

        String question;
        int rightAnswer;
        int answerGiven;
        int rightAnswersGiven = 0;
        int wrongAnswersGiven;
        Scanner scanner = new Scanner(System.in);

        for (String[] questAns: questionsAndAnswers) {

            question = questAns[0];
            rightAnswer = Integer.parseInt(questAns[1]);


            System.out.println(question);
            for (int i = 2; i < questAns.length; i++) {
                System.out.println(questAns[i]);
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
