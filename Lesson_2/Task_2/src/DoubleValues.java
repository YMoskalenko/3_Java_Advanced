import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DoubleValues {
    static void doubleValues(List<String> Lists) {
        for (int i = 0; i < Lists.size(); i++) {
            System.out.print(Lists.get(i) + ", " + Lists.get(i) + '\n');
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();

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
