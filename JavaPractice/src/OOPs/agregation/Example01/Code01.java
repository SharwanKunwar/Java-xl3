package OOPs.agregation.Example01;

public class Code01 {
    static void main(String[] args) {
        Book b1 = new Book("48 law of power", 333);
        Book b2 = new Book("Atomic Habit", 234);
        Book b3 = new Book("The power of subConcues",300);

        Book[] books = {b1,b2,b3};

        Library library = new Library("Lucifer-Books",2025, books);

        library.about();

    }
}
