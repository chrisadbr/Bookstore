public class Section {
    private String book_section;
    private Bookstore book;
    //
    public Section(Bookstore store, String section)
    {
        book = new Bookstore(store);
        book_section = section;
    }
    public String getSection()
    {
        return this.book_section;
    }
    //
    public Bookstore getBook()
    {
        return new Bookstore(book);
    }
    public String toString()
    {
        String str;
        str = "Invoice:\n" + book.toString();
        str += "\nSection: " + getSection();
        return str;
    }
}
