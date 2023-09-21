import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        //ArrayList<Exercise_3_Book> library = new ArrayList<>();
        Exercise_3_Library library = new Exercise_3_Library();
        do {
            exit = library.getMenu();
            /*System.out.println("""
                1. Add a book to the library
                2. Search for a book by name
                3. List all available books
                4. Return a book
                5. Quit
                """);*/

        /*String input = sc.nextLine();

            switch (input) {
                case "1":
                    library.addBook();
                    /*System.out.println("- Lägg till en bok i biblioteket - ");
                    System.out.println("Ange namn: ");
                    String name = sc.nextLine();
                    System.out.println("Ange författare: ");
                    String author = sc.nextLine();
                    System.out.println("Ange årtal: ");
                    String year = sc.nextLine();
                    System.out.println("Ange upplaga: ");
                    String revision = sc.nextLine();
                    library.add(new Exercise_3_Book(name, author, year, revision));
                    break;
                case "2":
                    library.searchBook();
                    /*System.out.println("- Sök efter en bok - ");
                    System.out.println("Ange titel att söka efter");
                    String title = sc.nextLine();
                    for(Exercise_3_Book book : library){
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
                    break;
                case "3":
                    library.listBooks();
                    /*System.out.println("List all available books");
                    for(Exercise_3_Book book : library){
                        System.out.println(book);
                    }
                    break;
                case "4":
                    library.returnBook();
                    /*System.out.println("Return a book");
                    System.out.println("Ange bok att återlämna: ");
                    String bookToReturn = sc.nextLine();
                    boolean returned = false;
                    for(Exercise_3_Book book : library){
                        if(book.getName().equals(bookToReturn)){
                            returned = book.returnBook(book);
                        }
                    }
                    if(returned)
                        System.out.println("Boken är återlämnad");
                    else
                        System.out.println("Boken återlämnades inte");
                    break;
                default:
                    exit = true;
                    break;
            }*/
        } while (!exit);
    }
}