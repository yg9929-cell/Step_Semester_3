package practiceproblems;
import java.util.*;
import java.time.*;
abstract class LibraryItem {
    String title;
    LibraryItem(String title) {
        this.title = title;
    }
    abstract LocalDate getDueDate(LocalDate currentDate);
}
class Book extends LibraryItem {
    Book(String title) {
        super(title);
    }
    LocalDate getDueDate(LocalDate currentDate) {
        return currentDate.plusDays(14);
    }
}
class DVD extends LibraryItem {
    DVD(String title) {
        super(title);
    }
    LocalDate getDueDate(LocalDate currentDate) {
        return currentDate.plusDays(7);
    }
}
class Magazine extends LibraryItem {
    Magazine(String title) {
        super(title);
    }
    LocalDate getDueDate(LocalDate currentDate) {
        return currentDate.plusDays(3);
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LocalDate currentDate = LocalDate.of(2023, 10, 26);
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            int space = line.indexOf(" ");
            String type = line.substring(0, space);
            String title = line.substring(space + 1).replace("\"", "");
            LibraryItem item;
            if (type.equals("BOOK")) {
                item = new Book(title);
            } else if (type.equals("DVD")) {
                item = new DVD(title);
            } else {
                item = new Magazine(title);
            }
            LocalDate dueDate = item.getDueDate(currentDate);
            System.out.println(item.title + ": " + dueDate);
        }
        sc.close();
    }
}