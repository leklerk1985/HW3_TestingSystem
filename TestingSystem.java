import java.util.*;

public class TestingSystem {
    public static void main(String[] args) {
        int rightAnswersGiven = 0;
        int wrongAnswersGiven;
        int rightAnswer;
        int answerGiven;
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<HashMap<String, Integer>>> questions = new ArrayList<>();


        // Добавляем данные по 1-му вопросу.
        HashMap<String, Integer> quest11 = createHashMap("Назовите самую большую планету Солнечной системы.", 3);
        HashMap<String, Integer> quest12 = createHashMap("1. Сатурн", null);
        HashMap<String, Integer> quest13 = createHashMap("2. Венера", null);
        HashMap<String, Integer> quest14 = createHashMap("3. Юпитер", null);
        HashMap<String, Integer> quest15 = createHashMap("4. Марс", null);
        HashMap<String, Integer> quest16 = createHashMap("5. Нептун", null);

        ArrayList<HashMap<String, Integer>> question1Data = new ArrayList<>();
        question1Data.add(quest11);
        question1Data.add(quest12);
        question1Data.add(quest13);
        question1Data.add(quest14);
        question1Data.add(quest15);
        question1Data.add(quest16);

        questions.add(question1Data);

        // Добавляем данные по 2-му вопросу.
        HashMap<String, Integer> quest21 = createHashMap("Как называется галактика, в которой находится Солнечная система?", 1);
        HashMap<String, Integer> quest22 = createHashMap("1. Млечный путь", null);
        HashMap<String, Integer> quest23 = createHashMap("2. Галактика Андромеды", null);
        HashMap<String, Integer> quest24 = createHashMap("3. M 110", null);

        ArrayList<HashMap<String, Integer>> question2Data = new ArrayList<>();
        question2Data.add(quest21);
        question2Data.add(quest22);
        question2Data.add(quest23);
        question2Data.add(quest24);

        questions.add(question2Data);


        // Добавляем данные по 3-му вопросу.
        HashMap<String, Integer> quest31 = createHashMap("Назовите область Солнечной системы, " +
                "находящуюся между планетами земной группы и газовыми гигантами.", 2);
        HashMap<String, Integer> quest32 = createHashMap("1. Пояс Койпера", null);
        HashMap<String, Integer> quest33 = createHashMap("2. Пояс астероидов", null);
        HashMap<String, Integer> quest34 = createHashMap("3. Пояс Ориона", null);

        ArrayList<HashMap<String, Integer>> question3Data = new ArrayList<>();
        question3Data.add(quest31);
        question3Data.add(quest32);
        question3Data.add(quest33);
        question3Data.add(quest34);

        questions.add(question3Data);


        for (ArrayList<HashMap<String, Integer>> question: questions) {
            String text;
            for (HashMap<String, Integer> item: question) {
                text = (String) item.keySet().toArray()[0];
                System.out.println(text);
            }
            System.out.println();

            rightAnswer = (int) question.get(0).values().toArray()[0];
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

    private static HashMap<String, Integer> createHashMap(String text, Integer rightAnswer) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(text, rightAnswer);
        return hm;
    }
}




