public class Underwear extends Clothing {
    
    public Underwear() {
        this(30.0);
    }
    
    public Underwear(double basePrice) {
        setBasePrice(basePrice);
    }
    
    @Override
    public double calculatePrice() {
        return getBasePrice() * (1 + getVat()) * 1.45;
    }
    
    @Override
    public void howToWash() {
        System.out.println("Wash Underwear at 60 degrees.");
    }
}