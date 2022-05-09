import java.util.ArrayList;

/*
Create a liberary management system which is capable of issueing booke to the student
Book should have info like:
1. Book name
2. Book author
3. Issue to
4. Issue on

User should be able too issue book, return book, add book
Assume that all the users are registered with their names in the central database

*/


class Book{
    

    public String name, author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [Name=" + name + "," + "Author=" + author +  "]";
    }
}


class MyLiberary{  // This is liberary where all book are oresent
    public ArrayList<Book> books;  //Book is the name of arrayList and books is the object
    MyLiberary(ArrayList<Book> books) {
        this.books = books;              
    }

    public void addBook(Book book){
        System.out.println("The book: "+book+ " has been added to the liberary");
        this.books.add(book);
    }
    public void issueBook(Book book, String issue_to){
        System.out.println("The book: "+book+" has been issued from the liberary to "+issue_to);
        this.books.remove(book);
    }

    public void returnBook(Book b){
        System.out.println("The book: "+b+ " has been returned");
        this.addBook(b);
    }

}


public class Ch16_7_LiberaryManagement {
    public static void main(String[] args){
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Atomic Habit","Clrs");
        bk.add(b1);
        Book b2 = new Book("Algorithms","Sonu");
        bk.add(b2);
        Book b3 = new Book("RichDad","Monty");
        bk.add(b3);


        MyLiberary l  = new MyLiberary(bk);
        l.addBook(new Book("Algo4","MyAuthor"));
        System.out.println(l.books);
        l.issueBook(b2, "Ammy");
        System.out.println(l.books);
    }
    
}
