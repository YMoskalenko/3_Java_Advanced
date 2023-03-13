import java.util.LinkedList;
import java.util.Scanner;

public class TextInputUntilEnd {
        public static void main(String[] args) {
            LinkedList<String> rowList = new LinkedList<>();
            System.out.println("Вводьте рядки, при необхідності закінчити введення, напишіть: end ");
            Scanner scanner = new Scanner(System.in);

            do {
                String row = scanner.nextLine();
                rowList.add(row);
                if (row.equalsIgnoreCase("end")) {
                    rowList.removeLast();
                    break;
                }
            } while (true);

            System.out.println("Введений перелік: ");
            for (String s : rowList) {
                System.out.print(" * " + s + "\n");
            }
        }
}
