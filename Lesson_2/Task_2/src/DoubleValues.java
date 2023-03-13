import java.util.ArrayList;
import java.util.Scanner;

class DoubleValues {
    static void doubleValues(ArrayList<String> arrayLists) {
        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.print(arrayLists.get(i) + ", " + arrayLists.get(i) + '\n');
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Введіть " + i + " слово: ");
            String wordTmp = scanner.next();
            words.add(wordTmp);
        }

        System.out.println("Введені вами слова");
        for (String s : words) {
            System.out.print(s + "   ");
        }
        System.out.println();

        System.out.println("Подвоєнні елементи");
        doubleValues(words);
    }

}
