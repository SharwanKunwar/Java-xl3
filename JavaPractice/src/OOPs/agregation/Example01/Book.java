package OOPs.agregation.Example01;

public class Book {
    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
    void displayInfo(){
        System.out.println("The title is : "+this.title);
        System.out.println("and it contain "+this.pages+" pages.");
    }
}
