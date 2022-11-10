import java.util.*;

public class TestingSystem {
    public static void main(String[] args) {
        // Подготовительные операции: создание переменных и коллекций.
        int rightAnswersGiven = 0;
        int wrongAnswersGiven;
        int answerGiven;
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Object> questionQ1 = new HashMap();
        questionQ1.put("question", "Назовите самую большую планету Солнечной системы.");
        String[] answersQ1 = {"1. Сатурн", "2. Венера", "3. Юпитер", "4. Марс", "5. Нептун"};
        questionQ1.put("answers", answersQ1);
        questionQ1.put("rightAnswer", 3);

        HashMap<String, Object> questionQ2 = new HashMap();
        questionQ2.put("question", "Как называется галактика, в которой находится Солнечная система?");
        String[] answersQ2 = {"1. Млечный путь", "2. Галактика Андромеды", "3. M 110"};
        questionQ2.put("answers", answersQ2);
        questionQ2.put("rightAnswer", 1);

        HashMap<String, Object> questionQ3 = new HashMap();
        questionQ3.put("question", "Назовите область Солнечной системы, находящуюся между " +
                "планетами земной группы и газовыми гигантами.");
        String[] answersQ3 = {"1. Пояс Койпера", "2. Пояс астероидов", "3. Пояс Ориона"};
        questionQ3.put("answers", answersQ3);
        questionQ3.put("rightAnswer", 2);

        HashMap<String, Object>[] questions = new HashMap[3];
        questions[0] = questionQ1;
        questions[1] = questionQ2;
        questions[2] = questionQ3;


        // Основная часть: работа системы тестирования.
        for (HashMap<String, Object> question: questions) {
            System.out.println(question.get("question"));
            for (String answer: (String[]) question.get("answers")) {
                System.out.println(answer);
            }
            System.out.println();

            answerGiven = Integer.parseInt(scanner.next());
            if (answerGiven == (int) question.get("rightAnswer")) {
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
