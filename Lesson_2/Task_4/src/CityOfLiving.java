import java.util.HashMap;
import java.util.Scanner;

class CityOfLiving {
    public static void main(String[] args) {
        HashMap<String, String> cityFamily = new HashMap<>();
        cityFamily.put("moskou", "dead ork'и");
        cityFamily.put("Ukraine", "Heroes");
        cityFamily.put("Paris", "Makrons'и");
        cityFamily.put("London", "Dzhonsoniuk'и");
        cityFamily.put("Vinnitsa", "Boghun'и");

        System.out.println("Виберіть місто для виводу типової фамілії мешканці:");
        for (String key : cityFamily.keySet()) {
            System.out.println(key);
        }

        System.out.println("Якщо бажаєте завершити роботу введіть: EXIT");
        System.out.println("----------------------------------\n");
        String city = null;

        do {
            Scanner scanner = new Scanner(System.in);
            city = scanner.nextLine();
            if (cityFamily.containsKey(city)) {
                System.out.println("В місті " + city + " живуть: " + cityFamily.get(city));
            } else if (city.equalsIgnoreCase("EXIT")) {
                break;
            } else {
                System.out.println("Невірно введені дані");
            }
        } while (true);
    }
}
