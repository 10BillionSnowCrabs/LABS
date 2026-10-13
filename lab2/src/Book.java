public class Book
{
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available)
    {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle(){ return title;}
    public String getAuthor(){ return author;}


    void borrow() {
        if(this.available == false)
        {
            System.out.println("Książka: '" + this.title +  "' nie jest aktualnie dostępna.");
        }
        else
        {
            this.available = false;
            System.out.println("Książka pod tytułem: '" + this.title + "' została wypożyczona.");
        }
    }

    void returnBook()
    {
        if(this.available == true)
        {
            System.out.println("Nie możesz oddać książki która nie jest wypożyczona.");
        }
        else
        {
            this.available = true;
            System.out.println("Dziękujemy za oddanie książki: '" + this.title + "'.");
        }
    }

    public static void main(String[] args)
    {
        Book book1 = new Book("Omniscient Reader's Viewpoint","singNsong", true);
        Book book2 = new Book("Turning","Kuyu", true);
        Book book3 = new Book("Katedra","Jacek Dukaj", true);

        book2.getTitle();
        book2.borrow();
        book2.returnBook();
        book1.returnBook();
        book3.borrow();
        book3.borrow();
    }
}
