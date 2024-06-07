package lr8.TaskJSON;

import lr8.TaskXML.Lesson;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Task2 {
    static Object obj;
    static JSONObject jsonObject;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            JSONParser parser = new JSONParser();
            obj = parser
                    .parse(new FileReader("src/lr8/TaskJSON/lessons.json"));
            jsonObject = (JSONObject) obj;
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

        // Добавляем новый предмет
        System.out.println("Введите новый предмет");
        Lesson lesson3 = new Lesson(in.nextLine(), in.nextLine(), in.nextLine());
        addLesson(lesson3);

        // Выводим данные в консоль
        ShowLessons();

        //Возможность искать предмет
        System.out.println("Введите название предмета, который хотите найти");
        SearchLesson(in.nextLine());

        //Возможность удалять предмет
        System.out.println("Введите название предмета, который хотите удалить");
        removeLesson(in.nextLine());
        //Повторно выводим в консоль
        System.out.println("Проверка результата");
        ShowLessons();
    }

    public static void ShowLessons() {
        try {

            System.out.println("Корневой элемент: "
                    + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("lessons");
            for (Object o : jsonArray) {
                JSONObject lesson = (JSONObject) o;
                System.out.println("\nТекущий элемент: lesson");
                System.out.println("Название предмета: " + lesson.get("name"));
                System.out.println("Преподаватель: " + lesson.get("lecturer"));
                System.out.println("Аудитория: " + lesson.get("classroom"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addLesson(Lesson page) {
        JSONArray jsonArray = (JSONArray) jsonObject.get("lessons");
        JSONObject newLesson = new JSONObject();
        newLesson.put("name", page.name);
        newLesson.put("lecturer", page.lecturer);
        newLesson.put("classroom", page.classroom);
        jsonArray.add(newLesson);

    }

    public static void SearchLesson(String name) {
        JSONArray jsonArray = (JSONArray) jsonObject.get("lessons");
        for (Object o : jsonArray) {
            JSONObject lesson = (JSONObject) o;
            if (name.equals(lesson.get("name"))) {
                System.out.println("\nТекущий элемент: lesson");
                System.out.println("Название предмета: " + lesson.get("name"));
                System.out.println("Преподаватель: " + lesson.get("lecturer"));
                System.out.println("Аудитория: " + lesson.get("classroom"));
            }
        }
    }
    public static void removeLesson(String name){

        JSONArray jsonArray = (JSONArray) jsonObject.get("lessons");
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject lesson = (JSONObject) iterator.next();
            if (name.equals(lesson.get("name"))) {
                iterator.remove();
            }}
    }
}
