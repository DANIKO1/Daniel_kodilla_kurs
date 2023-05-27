package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;

import java.util.stream.Collectors;
public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String beautifulText = poemBeautifier.beautify("Text to beautify", (String::toUpperCase));
        System.out.println(beautifulText);

        String beautifulText2 = poemBeautifier.beautify("Text to beautify", (text -> "ABC" + text + "ABC"));
        System.out.println(beautifulText2);

        String beautifulText3 = poemBeautifier.beautify("Text to beautify", (text -> text.replace(" ", "*")));
        System.out.println(beautifulText3);

        String beautifulText4 = poemBeautifier.beautify("Text to beautify", (text -> text.length() + " letters ***" + text + "*** " + text.length() + " letters"));
        System.out.println(beautifulText4);

        String beautifulText5 = poemBeautifier.beautify("Text to beautify", (text -> text.concat(String.valueOf(text.hashCode()))));
        System.out.println(beautifulText5);

        String beautifulText6 = poemBeautifier.beautify("Daniel Z. test!!!", (text -> {
            StringBuilder sb = new StringBuilder();
            sb.append("|");
            for (int i = 0; i < text.length(); i++) {
                sb.append(text.charAt(i));
                sb.append("|");
            }
            return sb.toString(); }));
        System.out.println(beautifulText6);

        String beautifulText7 = poemBeautifier.beautify("Daniel A. test!!!", (text -> text.chars()
                .mapToObj(i -> Character.toString((char) i))
                .collect(Collectors.joining("|"))));
        System.out.println(beautifulText7);
    }
}