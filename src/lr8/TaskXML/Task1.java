package lr8.TaskXML;

import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
public class Task1 {
    static Document doc;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        try {

            File inputFile = new File("src/lr8/TaskXML/lessons.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(inputFile);

            // Добавляем новый предмет
            System.out.println("Введите новый предмет");
            Lesson lesson3 = new Lesson(in.nextLine(),in.nextLine(),in.nextLine());
            addLesson(lesson3);

            // Добавляем новый элемент в файл XML
            doc.setXmlStandalone(true);
            doc.getDocumentElement().normalize();
            Transformer transformer =
                    TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(inputFile);
            transformer.transform(source, result);
            System.out.println("Новый предмет добавлен успешно! Список предметов:");

            // Выводим данные в консоль
            ShowLessons();

            //Возможность искать предмет
            System.out.println("Введите название предмета, который хотите найти");
            String search = in.nextLine();
            SearchLesson(search);

            //Возможность удалять предмет
            System.out.println("Введите название предмета, который хотите удалить");
            removeLesson(in.nextLine());
            //Повторно выводим в консоль
            System.out.println("Проверка результата:");
            ShowLessons();

            // Сохраняем изменения в файл
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void addLesson( Lesson page) {
        Element root = doc.getDocumentElement();
        Element lesson = doc.createElement("lesson");
        root.appendChild(lesson);

        Element name = doc.createElement("name");
        name.appendChild(doc.createTextNode(page.name));
        lesson.appendChild(name);

        Element lecturer = doc.createElement("lecturer");
        lecturer.appendChild(doc.createTextNode(page.lecturer));
        lesson.appendChild(lecturer);

        Element classroom = doc.createElement("classroom");
        classroom.appendChild(doc.createTextNode(page.classroom));
        lesson.appendChild(classroom);
    }
    public static void ShowLessons() {
        NodeList nodeList = doc.getElementsByTagName("lesson");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println("\nТекущий элемент: " + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Название предмета: "
                        + element.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("Преподаватель: "
                        + element.getElementsByTagName("lecturer").item(0).getTextContent());
                System.out.println("Аудитория: "
                        + element.getElementsByTagName("classroom").item(0).getTextContent());
            }
        }
    }
    public static void SearchLesson(String name){
        NodeList nodeList = doc.getElementsByTagName("lesson");
        boolean found = false;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                if (name.equals(element.getElementsByTagName("name").item(0).getTextContent())) {
                    System.out.println("Название предмета: "
                            + element.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Преподаватель: "
                            + element.getElementsByTagName("lecturer").item(0).getTextContent());
                    System.out.println("Аудитория: "
                            + element.getElementsByTagName("classroom").item(0).getTextContent());
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Предмет не найден");
        }
    }
    public static void removeLesson(String name) {
        NodeList nodeList = doc.getElementsByTagName("lesson");
        boolean found = false;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                if (name.equals(element.getElementsByTagName("name").item(0).getTextContent())) {
                    Node parentNode = element.getParentNode();
                    parentNode.removeChild(element);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Предмет не найден");
        }
    }
}
