public class Vegetable extends Food implements Washable, Vegan {
    
    public Vegetable() {
        this(10.0);
    }

    public Vegetable(double basePrice) {
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * (1 + getVat()) * 1.25;
    }

    @Override
    public void howToWash() {
        System.out.println("Wash Vegetable with warm water.");
    }

    @Override
    public void madeOf() {
        System.out.println("It is made only of vegetables.");
    }
}
