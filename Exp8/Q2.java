package Exp8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 for issue, 2 for return, 3 for search");
        int choice = input.nextInt();
        input.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                Issue issue = new Issue();
                issue.getBookName();
                issue.displayBookNames();
                break;
            case 2:
                Return ret = new Return();
                ret.getBookName();
                ret.displayBookNames();
                break;
            case 3:
                Search search = new Search();
                search.getBookName();
                break;
            default:
                System.out.println("Invalid choice");
        }

        input.close();
    }
}


abstract class LibraryManagement {
    protected List<String> books;

    public LibraryManagement() {
        books = new ArrayList<>();
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 3");
    }

    abstract void getBookName();

    void displayBookNames() {
        System.out.println("Available books:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}

class Issue extends LibraryManagement {
    Scanner input = new Scanner(System.in);

    void getBookName() {
        System.out.println("Enter book name to issue: ");
        String bookName = input.nextLine();

        if (books.contains(bookName)) {
            books.remove(bookName);
            System.out.println("You have borrowed " + bookName);
        } 
        else {
            System.out.println(bookName + " is not available.");
        }
    }
}

class Return extends LibraryManagement {
    Scanner input = new Scanner(System.in);

    void getBookName() {
        System.out.println("Enter book name to return: ");
        String bookName = input.nextLine();

        books.add(bookName);
        System.out.println("You have returned " + bookName);
    }
}

class Search extends LibraryManagement {
    Scanner input = new Scanner(System.in);

    void getBookName() {
        System.out.println("Enter book name to search: ");
        String bookName = input.nextLine();

        if (books.contains(bookName)) {
            System.out.println(bookName + " is available.");
        } else {
            System.out.println(bookName + " is not available.");
        }
    }
}