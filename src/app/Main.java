package app;

import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    private static final String BASE_PATH = "files/";

    public static void main(String[] args) {
        Scanner inputContent = new Scanner(System.in);
        FileHandler handler = new FileHandler();
        String newFileName = "myfile";
        String path = BASE_PATH + newFileName + ".txt";

        System.out.print("Enter file content: ");
        String content = inputContent.nextLine();

        // Виклики методів маніпуляції з файлом
        getOutput(handler.createFile(path));
        getOutput(handler.writeToFile(Paths.get(path), content));
        getOutput("CONTENT: " + handler.readFromFile(path));
        inputContent.close();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}

