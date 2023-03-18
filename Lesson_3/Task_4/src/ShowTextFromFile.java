/*
 * Copyright y.moskalenko
 * https://t.me/MorpheusVN
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShowTextFromFile {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader
                (new InputStreamReader(new FileInputStream("..\\Task_4\\src\\Readme"), "CESU8"))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
