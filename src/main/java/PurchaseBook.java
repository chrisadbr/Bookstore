public class PurchaseBook {
    private int quantity;
    private Bookstore book;
    //
    public PurchaseBook(Bookstore bst, int q)
    {
        this.quantity = q;
        this.book = new Bookstore(bst);
    }
    //
    public PurchaseBook(PurchaseBook psb)
    {
        this.quantity = psb.quantity;
        this.book = psb.book;
    }
    public Bookstore getBook(){
        return new Bookstore(book);
    }
    //
    public double getCost()
    {
        return this.quantity * book.getPrice();
    }
}
