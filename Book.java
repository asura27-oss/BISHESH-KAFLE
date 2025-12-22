public class Book {
    String title;
    String author;
    String isbn;
    String publicationYear;
    String genre;
    double price;
    boolean availabilityStatus;
    Book(String title, String author, String isbn, String publicationYear, String genre, double price, boolean availabilityStatus) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.price = price;
        this.availabilityStatus = availabilityStatus;
    }
    public void gg() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availabilityStatus);
        System.out.println();
    }
    public static void main(String[] args) {
        Book obj1 = new Book("Raat bhari huri chalo","Indra Rai","6084","1988","Society, Psychology",300.0,true);
        Book obj2 = new Book("Paral ko aago","Tomra Mainali","6087","1989","Society, Psychology, Family",290.0,true);
        obj1.gg();
        obj2.gg();
    }
}

