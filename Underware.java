public class Underware extends Clothing {
    
    public Underware() {
        this(30.0);
    }
    
    public Underware(double basePrice) {
        setBasePrice(basePrice);
    }
    
    @Override
    public double calculatePrice() {
        return getBasePrice() * (1 + getVat()) * 1.45;
    }
    
    @Override
    public void howToWash() {
        System.out.println("Wash Underware at 60 degrees.");
    }
}