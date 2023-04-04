public class Dairy extends Food {
    
    public Dairy() {
        this(8.0);
    }

    public Dairy(double basePrice){
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * (1 + getVat()) * 1.3;
    }
}