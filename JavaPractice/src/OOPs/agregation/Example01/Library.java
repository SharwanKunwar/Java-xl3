package OOPs.agregation.Example01;

public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }
    void about(){
        System.out.println("The name of the library is "+this.name+"\nand it is stablished in "+this.year);
        System.out.println("and we have : ");
        int count = 1;
        for(Book item: books){
            item.displayInfo();
            System.out.println();
            count++;
        }
    }
}
