/*
 * Copyright y.moskalenko
 * https://t.me/MorpheusVN
 */
import java.io.*;
public class FileOpening {

    public static void main(String[] args) throws IOException {

        File file = new File("..\\Task_2\\src\\file.txt");

        FileWriter fileWriter = new FileWriter(file, true);

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.write("Доброго вечора - Ми з УКРАЇНИ!" + "\n");
        printWriter.flush(); // Очищає потік printWriter
        printWriter.close(); // Закриває потік printWriter
        fileWriter.close(); // Закриває потік fileWriter

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String string;
        while ((string = bufferedReader.readLine()) != null){
            System.out.println(string);
        }

        bufferedReader.close(); // Закриває потік bufferedReader
    }
}
