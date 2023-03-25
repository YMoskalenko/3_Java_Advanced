/*
 * Copyright y.moskalenko
 * https://t.me/MorpheusVN
 */

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Decoder {
    public static void main(String[] args) {

        // отримуємо прийменники із файлу
        Path preposition = Paths.get("..\\Task_2\\src\\preposition.txt");

        List<String> prepositionArray = new ArrayList<>();

        try {
            prepositionArray = Files.readAllLines (preposition, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // читаємо файл із повним текстом
        StringBuilder newText = new StringBuilder();
        try (BufferedReader textReader = new BufferedReader(new InputStreamReader
                (new FileInputStream("..\\Task_2\\src\\originalText.txt"), "UTF-8"))) {
            String text;
            while ((text = textReader.readLine()) != null) {
                newText.append(text).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String newString = newText.toString();

        // замінюємо усі прийменники словом Java
        for (int i = 0; i < prepositionArray.size(); i++) {
            Pattern p = Pattern.compile(prepositionArray.get(i), Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(newString);
            newString = m.replaceAll(" JAVA ");
        }

        // виводимо текст у новий файл
        try (FileWriter newTextFile = new FileWriter
                ("..\\Task_2\\src\\newText.txt")) {
            newTextFile.write(newString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n Результат виконання програми Ви можете переглянути у файлі newText.txt");
    }
}
