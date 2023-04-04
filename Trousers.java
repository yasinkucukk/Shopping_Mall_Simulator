public class Trousers extends Clothing {
    
    public Trousers() {
        this(40.0);
    }
    
    public Trousers(double basePrice) {
        setBasePrice(basePrice);
    }
    
    @Override
    public double calculatePrice() {
        return getBasePrice() * (1 + getVat()) * 1.2;
    }
    
    @Override
    public void howToWash() {
        System.out.println("Wash Trousers at 30 degrees.");
    }
}
