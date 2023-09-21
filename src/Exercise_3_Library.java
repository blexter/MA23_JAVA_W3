import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_3_Library {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Exercise_3_Book> book = new ArrayList<>();

    public Exercise_3_Library (Exercise_3_Book book){
        this.book.add(book);
    }
    public Exercise_3_Library(){

    }

    public boolean getMenu() {
        System.out.println("""
                1. Add a book to the library
                2. Search for a book by name
                3. List all available books
                4. Return a book
                5. Quit
                """);

        String input = sc.nextLine();

        switch (input) {
            case "1":
                this.addBook();
                return false;
            case "2":
                this.searchBook();
                return false;
            case "3":
                this.listBooks();
                return false;
            case "4":
                this.returnBook();
                return false;
            default:
                return true;
        }
    }
    public void addBook(){
        System.out.println("- Lägg till en bok i biblioteket - ");
        System.out.println("Ange namn: ");
        String name = sc.nextLine();
        System.out.println("Ange författare: ");
        String author = sc.nextLine();
        System.out.println("Ange årtal: ");
        String year = sc.nextLine();
        System.out.println("Ange upplaga: ");
        String revision = sc.nextLine();
        this.book.add(new Exercise_3_Book(name, author, year, revision));
    }

    public void searchBook(){
        System.out.println("- Sök efter en bok - ");
        System.out.println("Ange titel att söka efter");
        String title = sc.nextLine();
        for(Exercise_3_Book book : this.book){
            boolean found = book.searchByTitle(title);
            if(found){
                System.out.println("Bok funnen! Vill du låna den? (Ja/Nej)");
                if(sc.nextLine().equals("Ja")){
                    boolean result = book.loan(book);
                    if(result) {
                        System.out.println("Boken lånades ut!");
                    }
                    else
                        System.out.println("Boken kunde inte lånas ut");
                }
            }
        }
    }

    public void listBooks() {
        System.out.println("List all available books");
        for(Exercise_3_Book book : this.book){
            System.out.println(book);
        }

    }

    public void returnBook() {
        System.out.println("Return a book");
        System.out.println("Ange bok att återlämna: ");
        String bookToReturn = sc.nextLine();
        boolean returned = false;
        for(Exercise_3_Book book : this.book){
            if(book.getName().equals(bookToReturn)){
                returned = book.returnBook(book);
            }
        }
        if(returned)
            System.out.println("Boken är återlämnad");
        else
            System.out.println("Boken återlämnades inte");
    }

}

