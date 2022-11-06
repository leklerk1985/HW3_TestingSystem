import java.util.*;

public class TestingSystemCorr4 {
    public static void main(String[] args) {
        // Объявляем переменные.
        int rightAnswersGiven = 0;
        int wrongAnswersGiven;
        int answerGiven;
        int rightAnswer = 0;
        String questionText = "";
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, String> answerTexts = new TreeMap<Integer, String>();
        Set<Map.Entry<String, Integer>> entrySet;


        // Заводим данные вопросов и ответов.
        HashMap<String, Integer> firstQuestion = new HashMap<String, Integer>();
        firstQuestion.put("Назовите самую большую планету Солнечной системы.", 0);
        firstQuestion.put("1. Сатурн", 1);
        firstQuestion.put("2. Венера", 2);
        firstQuestion.put("3. Юпитер", 3);
        firstQuestion.put("4. Марс", 4);
        firstQuestion.put("5. Нептун", 5);
        firstQuestion.put("rightAnswer", 3);

        HashMap<String, Integer> secondQuestion = new HashMap<String, Integer>();
        secondQuestion.put("Как называется галактика, в которой находится Солнечная система?", 0);
        secondQuestion.put("1. Млечный путь", 1);
        secondQuestion.put("2. Галактика Андромеды", 2);
        secondQuestion.put("3. M 110", 3);
        secondQuestion.put("rightAnswer", 1);

        HashMap<String, Integer> thirdQuestion = new HashMap<String, Integer>();
        thirdQuestion.put("Назовите область Солнечной системы, находящуюся между планетами земной группы и газовыми гигантами.", 0);
        thirdQuestion.put("1. Пояс Койпера", 1);
        thirdQuestion.put("2. Пояс астероидов", 2);
        thirdQuestion.put("3. Пояс Ориона", 3);
        thirdQuestion.put("rightAnswer", 2);

        ArrayList<HashMap<String, Integer>> questions = new ArrayList<HashMap<String, Integer>>();
        questions.add(firstQuestion);
        questions.add(secondQuestion);
        questions.add(thirdQuestion);


        // Проводим тестирование пользователя.
        for (HashMap<String, Integer> question: questions) {
            answerTexts.clear();
            entrySet = question.entrySet();

            for (Map.Entry<String, Integer> item: entrySet) {
                if (item.getValue() == 0) {
                    questionText = item.getKey();
                    continue;
                }

                if (item.getKey() == "rightAnswer") {
                    rightAnswer = item.getValue();
                    continue;
                }

                answerTexts.put(item.getValue(), item.getKey());
            }

            System.out.println(questionText);

            for (String ansText: answerTexts.values()) {
                System.out.println(ansText);
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

        wrongAnswersGiven = questions.size() - rightAnswersGiven;
        System.out.println("Результат: правильно " + rightAnswersGiven + ", неправильно " + wrongAnswersGiven + ".");
    }
}
