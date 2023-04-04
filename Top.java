public class Top extends Clothing {
    
    public Top() {
        this(20.0);
    }

    public Top(double basePrice) {
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * (1 + getVat()) * 1.2;
    }

    @Override
    public void howToWash() {
        System.out.println("Wash Top at 40 degrees.");
    }
}
