import java.util.Scanner;
public class Driver {
    public static void main(String[] args)
    {
        setBookStore();
    }
    //
    public static void setBookStore()
    {
        String book_title;
        double book_price;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title: ");
        book_title = scanner.nextLine();
        System.out.print("Enter book price: ");
        book_price = scanner.nextDouble();
        //
        Bookstore book = new Bookstore(book_title, book_price);
        setPurchase(book);
    }
    public static void setPurchase(Bookstore bookstore)
    {
        int quantity;
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity of books: ");
        quantity = scanner.nextInt();
        PurchaseBook pb = new PurchaseBook(bookstore, quantity);
        printInvoice(pb, bookstore, quantity);
    }
    //
    public static void printInvoice(PurchaseBook b, Bookstore bk, int amount)
    {
        PrintInvoice total = new PrintInvoice(b, 0.18);
        Section section = new Section(bk, "Non-Fiction");
        System.out.println(section);
        //
        System.out.printf("Quantity: %d\n", amount);
        System.out.printf("VAT: %.2f%s\nTotal: Tsh %,.2f", total.getTax_rate() * 100, "%",
                total.getTotal());
    }
}
