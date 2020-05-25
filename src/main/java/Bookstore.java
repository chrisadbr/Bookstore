public class Bookstore {
    //
    private String book_title;
    private double price;

    public Bookstore(String b_tittle, double p)
    {
        this.book_title = b_tittle;
        this.price = p;
    }
    //
    public Bookstore(Bookstore bst)
    {
        this.book_title = bst.book_title;
        this.price = bst.price;
    }
    public String getBook_title()
    {
        return book_title;
    }
    public double getPrice()
    {
        return price;
    }
    public String toString()
    {
        String str;
        str = String.format("Book title: %s\nPrice: Tsh %,.2f",
                getBook_title(), getPrice());
        return str;
    }
}
