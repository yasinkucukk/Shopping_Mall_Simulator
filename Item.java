public abstract class Item {
    
    private double vat;
    private double basePrice;

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double price) {
        basePrice = price;
    }

    public abstract double calculatePrice();
}
