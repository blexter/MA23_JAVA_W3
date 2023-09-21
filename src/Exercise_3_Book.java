public class Exercise_3_Book {
    private String name;
    private String author;
    private String year;
    private String revision;
    private boolean availible = true;

    public Exercise_3_Book (String name, String author, String year, String revision) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.revision = revision;
    }

    public boolean searchByTitle (String name){
        if(this.name.equals(name))
            return true;
        else
            return false;
    }
    public boolean loan(Exercise_3_Book book){
        if(book.availible) {
            book.availible = false;
            return true;
        }
        return false;
    }

    public boolean returnBook(Exercise_3_Book book){
        if(!book.availible) {
            book.availible = true;
            return true;
        }
        return false;
    }

    public String toString() {
        String avab;
        if(this.availible)
            avab = " the book is availible for loan.";
        else
            avab = " the book is unavailble for loan.";
        return "Title: " + this.name + " Author: " + this.author + " Year: " + this.year + " Revision: " + this.revision + avab;
    }

    public String getName() {
        return name;
    }
}

