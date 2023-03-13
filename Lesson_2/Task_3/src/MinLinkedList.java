import java.util.LinkedList;
import java.util.Scanner;

class MinLinkedList {
    static int getMinimum (LinkedList <Integer> list) {
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            min = Math.min(min,list.get(i));
        }
        return min;
    }
    public static void main(String[] args) {

        LinkedList <Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Введіть " + i + " число: ");
            int varTmp = scanner.nextInt();
            list.add(varTmp);
        }

        System.out.println("Введені значення: ");
        System.out.println(list);

        System.out.println("Мінімальне значення серед введених даних: ");
        System.out.println(getMinimum(list));
    }
}