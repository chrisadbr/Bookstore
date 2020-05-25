public class PrintInvoice {
    private double tax_rate;
    private PurchaseBook purchase;
    //
    public PrintInvoice(PurchaseBook ps, double tax)
    {
        this.tax_rate = tax;
        this.purchase = new PurchaseBook(ps);
    }
    public PurchaseBook getPurchase(){
        return new PurchaseBook(purchase);
    }
    public double getTax_rate()
    {
        return tax_rate;
    }
    public double getTotal(){
        return (1 + tax_rate) * purchase.getCost();
    }
}
