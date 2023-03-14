import java.util.Map;
import java.util.Scanner;

class CityOfLiving {
    static Map<String, String> cityFamily = Map.of("moskou", "dead ork'и",
                                                   "Ukraine", "Heroes",
                                                   "Paris", "Makrons'и",
                                                   "London", "Dzhonsoniuk'и",
                                                   "Vinnitsa", "Boghun'и");
    public static void main(String[] args) {

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
