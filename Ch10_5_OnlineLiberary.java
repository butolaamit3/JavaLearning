// You have to create a "Liberary" using java class. 
// Create a constructor of  array liberary to store the books.
// Create Methods: "addBooks", "showAvailableBooks", "issueBook", "returnBooks".
// Properties: Array to store the available books.
// Array to store the issued books.

class Liberary{
    String books[];
    int no_of_books;
    Liberary(){
        books = new String[100];
        no_of_books = 0;
    }

    void addBooks(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(books+"Has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for(String book:books){
            if (book == null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String books){
        for(int i=0;i<this.books.length;i++){
            if (this.books[i] == books){
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;               
            }
        }
        System.out.println("This book does not exists");

    }
    void returnBook(String books){
        addBooks(books);
    }
}

public class Ch10_5_OnlineLiberary {
    public static void main(String[] args){
        Liberary centralLiberary = new Liberary();
        centralLiberary.addBooks("Think and Grow Rich");
        centralLiberary.addBooks("Atomic Habbits");
        centralLiberary.addBooks("Algorithims");
        centralLiberary.addBooks("Five Secondds Of Summer");
        centralLiberary.addBooks("The Clean Code");
        centralLiberary.issueBook("Algorithims");
        centralLiberary.showAvailableBooks();
        centralLiberary.returnBook("Algorithims");
        centralLiberary.showAvailableBooks();
    }
    
}
