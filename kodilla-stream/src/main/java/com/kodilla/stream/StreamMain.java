package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
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
            return sb.toString();
        }));
        System.out.println(beautifulText6);

        String beautifulText7 = poemBeautifier.beautify("Daniel A. test!!!", (text -> text.chars()
                .mapToObj(i -> Character.toString((char) i))
                .collect(Collectors.joining("|"))));
        System.out.println(beautifulText7);

// test NumbersGenerator
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println("___________________________________________");

        // test person.People
            People.getList().stream()
                    .map(String::toUpperCase)
                    .filter(s -> s.length() > 11)
                    .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                    .filter(s -> s.charAt(0) == 'M')
                    .forEach(System.out::println);

        System.out.println("___________________________________________");
        // test Book, BookDirectory
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        System.out.println("___________________________________________");
        System.out.println("Zadanie:Forum, ForumUser");

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUsers = forum.getForumUserList().stream() //zainicjuje strumień
                .filter(forumUser -> forumUser.getSex()=='M') // odfiltruje tylko tych użytkowników, którzy są mężczyznami,
                .filter(forumUser -> Period.between(forumUser.getBirthdayDate(), LocalDate.now()).getYears()>=20) //odfiltruje tylko tych użytkowników, którzy mają co najmniej 20 lat,
                .filter(forumUser -> forumUser.getPostsQty()>=1) //odfiltruje tylko tych użytkowników, którzy mają co najmniej jeden opublikowany post,
                .collect(Collectors.toMap(ForumUser::getIDNumber, ForumUser -> ForumUser)); //przy pomocy kolektora utworzy mapę par, w której rolę klucza będzie pełnił unikalny identyfikator użytkownika,

        mapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": "+ entry.getValue())
                .forEach(System.out::println); // wyświetli otrzymaną mapę wynikową
    }
}