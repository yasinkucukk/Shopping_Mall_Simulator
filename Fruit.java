public class Fruit extends Food implements Vegan, Washable {
    
    public Fruit() {
        this(6.0);
    }

    public Fruit(double basePrice) {
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * (1 + getVat()) * 1.2;
    }

    @Override
    public void howToWash() {
        System.out.println("Wash Fruit with cold water.");
    }

    @Override
    public void madeOf() {
        System.out.println("It is made only of fruits.");
    }
}
