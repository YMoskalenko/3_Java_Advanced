/*
 * Copyright y.moskalenko
 * https://t.me/MorpheusVN
 */
public class TextTrim {
    public static void main(String[] args) {
        String str1 = "Dune, also known as the Dune Chronicles, is an American science fiction media" +
                "franchise that originated with the 1965 novel Dune by Frank Herbert and has continued" +
                "to add new publications. Dune is frequently described as the best selling science fiction" +
                "novel in history. It won the inaugural Nebula Award for Best Novel and the Hugo Award in 1966," +
                "and was later adapted into a 1984 film, a 2000 television miniseries, and a 2021 film.";

        String str2 = str1.substring(0, str1.length() / 2); // Перша половина від початку (0) до length()/2 (50%)
        String str3 = str1.substring(str1.length() / 2); // Друга половина від length()/2 (50%) до кінця

        System.out.println("\n" + "Part 1: (first 50%)");
        String[] array2 = str2.split("\\."); // Ділення на рядки до "."
        for (String ar2 : array2) {
            System.out.println(ar2);
        }

        System.out.println("\n" + "Part 2: (second 50%)");
        String[] array3 = str3.split("\\."); // Ділення на рядки до "."
        for (String ar3 : array3) {
            System.out.println(ar3);
        }
    }
}
